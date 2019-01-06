package org.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.webservice.services.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

public class RappelRecupererLivre implements Tasklet {

    @Autowired
    private MailMail mailMail;

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        String from = "jokoker59@gmail.com";
        String nom = "Monsieur ";
        String to = "ed.vigier@gmail.com";
        String subject = "Retour Livre";
        String body = "Je vous conseille de rendre très vite votre livre.";

        Emprunt_Service empruntweb = new Emprunt_Service();
        EmpruntWebservice empruntwebSer = empruntweb.getEmpruntWebservicePort();
        List<Emprunt> emprunts = empruntwebSer.getEmpruntsEnCours();

        Utilisateur_Service Utilisateurweb = new Utilisateur_Service();
        UtilisateurWebservice UtilisateurwebSer = Utilisateurweb.getUtilisateurWebservicePort();
        List<Utilisateur> utilisateurs = UtilisateurwebSer.getUtilisateurs();

        Livre_Service LivreWeb = new Livre_Service();
        LivreWebservice LivreWebSer = LivreWeb.getLivreWebservicePort();
        List<Livre> livres = LivreWebSer.getLivres();

        java.util.Date input = new Date();
        LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        date = date.plusDays(3);
        String jour = " jours";
        String repousser = "";
        String texte = "";
        String titreLivre = "";

        try {

            for (Emprunt emprunt : emprunts) {
                LocalDate dateEmprunt = emprunt.getDateFin().toGregorianCalendar().toZonedDateTime().toLocalDate();
                long daysBetween = ChronoUnit.DAYS.between(dateEmprunt, date);
                daysBetween = 3 - daysBetween;

                if (!emprunt.isMailSent() && !emprunt.isRecupere()) {
                    Utilisateur utilisateur = UtilisateurwebSer.getUtilisateurById(emprunt.getIdUtilisateur());
                    to = utilisateur.getMail();
                    nom = utilisateur.getNom();
                    Livre livre = LivreWebSer.getLivreById(emprunt.getIdLivre());
                    titreLivre = livre.getTitre();
                    empruntwebSer.setMailSentByEmpruntId(emprunt.getId());
                    texte = "Bonjour, vous pouvez venir récupérer le livre " + titreLivre + " que vous avez réservé.";

                    mailMail.sendMail(to, nom, texte);
                } else {


                    Utilisateur utilisateur = UtilisateurwebSer.getUtilisateurById(emprunt.getIdUtilisateur());

                    if (emprunt.isEnCours() && !emprunt.isRecupere() && daysBetween < 0) {
                        empruntwebSer.livreNonRecupereByIdEmprunt(emprunt.getId());
                        System.out.println("suppression de la reservation du livre à l'id : " +
                                emprunt.getIdLivre() + " par l'utilisateur n°= " + emprunt.getIdUtilisateur());

                    }
                }


            }

        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("j ai fini");


        return RepeatStatus.FINISHED;
    }
}