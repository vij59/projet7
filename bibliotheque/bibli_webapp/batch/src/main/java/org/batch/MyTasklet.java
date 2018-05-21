package org.batch;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.webservice.services.Emprunt;
import org.webservice.services.EmpruntWebservice;
import org.webservice.services.Emprunt_Service;
import org.webservice.services.Utilisateur;
import org.webservice.services.UtilisateurWebservice;
import org.webservice.services.Utilisateur_Service;

@Component
public class MyTasklet implements Tasklet {


    @Autowired
    private MailMail mailMail;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

    	 String from = "jokoker59@gmail.com";
         String nom ="Monsieur ";
 		String to = "ed.vigier@gmail.com";
 		String subject = "Retour Livre";
 		String body = "Je vous conseille de rendre très vite votre livre.";

 		Emprunt_Service empruntweb = new Emprunt_Service();
 		EmpruntWebservice empruntwebSer = empruntweb.getEmpruntWebservicePort();
 		List<Emprunt> emprunts = empruntwebSer.getEmpruntsEnCours();

 		Utilisateur_Service Utilisateurweb = new Utilisateur_Service();
 		UtilisateurWebservice UtilisateurwebSer = Utilisateurweb.getUtilisateurWebservicePort();
 		List<Utilisateur> utilisateurs = UtilisateurwebSer.getUtilisateurs();

 		Date input = new Date();
 		LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
 		date = date.plusDays(3);
 		String jour = " jours";
 		String repousser = "";
 		String texte = "";

 		try {

 			for (Emprunt emprunt : emprunts) {
 				LocalDate dateEmprunt = emprunt.getDateFin().toGregorianCalendar().toZonedDateTime().toLocalDate();
 				if (dateEmprunt.compareTo(date) < 0) {
 					for (Utilisateur utilisateur : utilisateurs) {
 						if (utilisateur.getId() == emprunt.getIdUtilisateur()) {
 							to = utilisateur.getMail();
 							nom = nom + utilisateur.getNom();
 						}
 					}
 					long daysBetween = ChronoUnit.DAYS.between(dateEmprunt, date);
 					daysBetween = 3 - daysBetween;
 					if (daysBetween > 1) {
 						jour = " jours";
 					} else {
 						jour = " jour";
 					}
 					
 					if(emprunt.isDejaRepousse() == false) {
 						 repousser = ". Vous pouvez repousser votre date de retour d'un mois en vous connectant au site de la bibliotheque, dans votre accès personnalisé.";
 					}
 					else {
 						repousser ="";
 					}
 					
 					if(daysBetween==0) {
 						texte =	body + "Vous avez jusque ce soir minuit"
									+ ". Suite à cela nous nous verrons dans l'obligation de contacter les autorités"
									+ " Date de retour = " + dateEmprunt+repousser ;
 					}
 					else if(daysBetween <0) {
 						 texte =	body + "Vous avez dépassé la date de retour ("+dateEmprunt+")";
 					}
 					else {
 						 texte =	body + "Vous avez " + daysBetween + jour
									+ ". Suite à cela nous nous verrons dans l'obligation de contacter les autorités"
									+ " Date de retour = " + dateEmprunt+repousser ;
 					}
// 					MailMail mm = (MailMail)  context.getBean("mailMail");
// 		            mm.sendMail(from,to,nom, texte);
 					
 			      
 			       mailMail.sendMail(to, nom, texte);
 				}
 			}
 		} catch (Exception e) {
 			System.out.println("adresse mail pas bonne");
 		}
 		System.out.println("j ai fini");
	
    

        return RepeatStatus.FINISHED;
    }
}