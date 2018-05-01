package org.batch;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.webservice.services.Emprunt;
import org.webservice.services.EmpruntWebservice;
import org.webservice.services.Emprunt_Service;
import org.webservice.services.Utilisateur;
import org.webservice.services.UtilisateurWebservice;
import org.webservice.services.Utilisateur_Service;

@SpringBootApplication
@EnableScheduling
public class SpringBootSendingMailApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("javasampleapproachMailSender")
	public MailSender mailSender;

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSendingMailApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		String from = "jokoker59@gmail.com";
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

		try {

			for (Emprunt emprunt : emprunts) {
				LocalDate dateEmprunt = emprunt.getDateFin().toGregorianCalendar().toZonedDateTime().toLocalDate();
				if (dateEmprunt.compareTo(date) < 0) {
					for (Utilisateur utilisateur : utilisateurs) {
						if (utilisateur.getId() == emprunt.getIdUtilisateur()) {
							to = utilisateur.getMail();

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
					mailSender.sendMail(from, to, subject,
							body + "Vous avez " + daysBetween + jour
									+ ". Suite à cela nous nous verrons dans l'obligation de contacter les autorités"
									+ " Date de retour = " + dateEmprunt+repousser );
				}
			}
		} catch (Exception e) {
			System.out.println("adresse mail pas bonne");
		}
		System.out.println("j ai fini");

	}

}