package org.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.webservice.services.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

@Component
public class MyTaskletRendreLivre implements Tasklet {


    @Autowired
    private MailMail mailMail;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {

        String from = "jokoker59@gmail.com";
        String nom = "Monsieur ";
        String to = "ed.vigier@gmail.com";
        String subject = "Retour Livre";
        String body = "";

        Emprunt_Service empruntweb = new Emprunt_Service();
        EmpruntWebservice empruntwebSer = empruntweb.getEmpruntWebservicePort();
        List<Emprunt> listeEmprunts = empruntwebSer.getEmpruntsEnCours();

        Utilisateur_Service Utilisateurweb = new Utilisateur_Service();
        UtilisateurWebservice UtilisateurwebSer = Utilisateurweb.getUtilisateurWebservicePort();
        List<Utilisateur> utilisateurs = UtilisateurwebSer.getUtilisateurs();

        Livre_Service LivreWeb = new Livre_Service();
        LivreWebservice LivreWebSer = LivreWeb.getLivreWebservicePort();
        List<Livre> livres = LivreWebSer.getLivres();

        Date input = new Date();
        LocalDate dateJour = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dateDansCinqJours = dateJour.plusDays(5);
        String jour = " jours";
        String repousser = "";
        String texte = "";
        boolean rappelActif = true;
        boolean enRetard = false;


        try {
            // HashMap<Integer, Integer> utilisateursLivres = new HashMap<>();
            HashMap<String, String> utilisateursLivres = new HashMap<>();

            for (Utilisateur utilisateur : utilisateurs) {
                String listeTitreLivres = "";
               // int x = 0;
               // nom = utilisateur.getNom();
                List<Emprunt> emprunts = empruntwebSer.getEmpruntsEnCoursByUserId(utilisateur.getId());
                for (Emprunt emprunt : emprunts) {
                    int x = 0;
                    nom = utilisateur.getNom();
                    LocalDate dateEmprunt = emprunt.getDateFin().toGregorianCalendar().toZonedDateTime().toLocalDate();
                    if (dateEmprunt.compareTo(dateDansCinqJours) < 0) {
                        Livre livre = LivreWebSer.getLivreById(emprunt.getIdLivre());
                        //  listeTitreLivres.add(livre.getTitre() + " Date de retour normalement prévu =" + emprunt.getDateFin());

                        long daysBetween = DAYS.between(dateEmprunt, dateJour);

                        if (daysBetween > 1) {
                            jour = " jours";
                        } else {
                            jour = " jour";
                        }

                        System.out.print(" days between  emprunt " + emprunt.getId()+" = " +daysBetween);
                        if (daysBetween < 6 && rappelActif == true) {

                            //  SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                            // String  DateToStr = format.format(emprunt.getDateFin().toGregorianCalendar().toZonedDateTime().toLocalDate());
                            body= "Vous devez retourner certains ouvrages sous " + daysBetween+" jours.";
                            listeTitreLivres = listeTitreLivres + " \n" + livre.getTitre() + " - date de retour" +
                                    " prévue = " + dateEmprunt;
                            x++;
                        }


                    }
                    if (x > 0) {
                        utilisateursLivres.put(utilisateur.getMail(), listeTitreLivres);
                    }
                    //   utilisateursLivres.put(utilisateur, empruntwebSer.getEmpruntsEnCoursByUserId(utilisateur.getId()));
                }

            }


            for (String Key : utilisateursLivres.keySet()) {
                String livresArendre = utilisateursLivres.get(Key);
                to = Key;
                System.out.println(to + " " + livresArendre);
                mailMail.sendMail(to, nom, body + livresArendre);
            }


        } catch (Exception e) {
            System.out.println("adresse mail pas bonne");
        }
        System.out.println("j ai fini");


        return RepeatStatus.FINISHED;
    }
}