package org.application.run;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.application.business.contract.ManagerFactory;
import org.application.model.Auteur;
import org.application.model.Emprunt;
import org.application.model.Livre;
import org.application.model.Utilisateur;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {    
        ApplicationContext vApplicationContext
        = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");
        
        ManagerFactory managerFactory = (ManagerFactory) vApplicationContext.getBean("managerFactory");
        List<Utilisateur> list = managerFactory.getUtilisateurManager().getUtilisateurs();
       
    	
		 String liston ="";
			  liston = list.get(0).getNom();
	
		 System.out.println(liston);
		 
		
		 
//			List<Livre> listeLivres = managerFactory.getLivreManager().getLivres();

			//System.out.println(listeLivres.get(0).getTitre());
		
			List<Auteur> nomAuteur =  managerFactory.getAuteurManager().getAuteurs();
			
		System.out.println("bite");
			
			List<Livre> listeLivres = managerFactory.getLivreManager().getLivres();
			List<Livre> listeLivresBis ;
			int i=0;
			//listeLivresBis.clear();
	    	for(Livre livre : listeLivres ) {
	    		Auteur auteur = managerFactory.getAuteurManager().getAuteurById(livre.getIdAuteur());
	    		livre.setAuteur(auteur);
	    		//System.out.println(auteur.getNom());
	    		System.out.println((listeLivres.get(i)).getAuteur().getNom());
	    		i++;
	    	}
	    	
	    	System.out.println(listeLivres);
	    	//System.out.println(listeLivresBis);
	    	
	    	System.out.println("bite");
			
//			List<Emprunt> emprunts  = managerFactory.getEmpruntManager().getAllEmprunts();
//			
//			Emprunt emprunt = new Emprunt();
//			emprunt.setIdLivre(3);
//			emprunt.setIdUtilisateur(2);
//			
//			managerFactory.getEmpruntManager().newEmprunt(emprunt);
//			
//			
			boolean dispo = managerFactory.getEmpruntManager().empruntPossible(3);
			System.out.println(dispo);
			Livre livre = managerFactory.getLivreManager().getLivreById(3);
			System.out.println("il en reste : "+ livre.getNbRestant());
			System.out.println(dispo);

			
			Auteur auteur =  managerFactory.getAuteurManager().getAuteurById(1);
			System.out.println(auteur.getNom() + auteur.getPrenom());
			
			List<Livre> listeLi = managerFactory.getLivreManager().getLivreByRecherche("","eric");
			System.out.println(listeLi);
			for(Livre  livr : listeLi) {
				System.out.println(livr.getId());
			}
			
			Utilisateur util = managerFactory.getUtilisateurManager().getUtilisateurByEmail("joo");
			System.out.println(util.getMail() + "biteenbois" + util.getId());
			
			
			List<Emprunt> emprunts  = managerFactory.getEmpruntManager().getEmpruntByUserId(2);
			for(Emprunt emp : emprunts) {
				System.out.println(emp.getDateFin());
			}
			
//			List<Emprunt> emprunts  = managerFactory.getEmpruntManager().getAllEmprunts();
//			for(Emprunt  empr : emprunts) {
//				if(empr.getId() > 5) {
//					managerFactory.getEmpruntManager().empruntProlonge(empr);
//				}
//				System.out.println(empr.getId());
//				
//			}
			
			
    }
}
