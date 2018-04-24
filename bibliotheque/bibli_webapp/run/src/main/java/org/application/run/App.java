package org.application.run;

import java.util.List;

import org.application.business.contract.ManagerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.webservice.services.Auteur;
import org.webservice.services.AuteurWebservice;
import org.webservice.services.Auteur_Service;
import org.webservice.services.Emprunt;
import org.webservice.services.EmpruntWebservice;
import org.webservice.services.Emprunt_Service;
import org.webservice.services.Livre;
import org.webservice.services.LivreWebservice;
import org.webservice.services.Livre_Service;

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
    	
//    	Salut service = new Salut();
//		BonjourController bonjour = service.getBonjourControllerPort();
//		String nomUtil = bonjour.afficherBonjour(1);
//		
//		Utilisateur user = new Utilisateur();
//		user.setNom(nomUtil);
//		
//		
//        System.out.println(nomUtil);
        
        Auteur_Service webser = new Auteur_Service();
        AuteurWebservice auteurSer = webser.getAuteurWebservicePort();
        List<Auteur> nomAuteur = auteurSer.listAuteurs();
        System.out.println(nomAuteur.get(0).getNom());
        
       Emprunt_Service empruntweb = new Emprunt_Service();
        EmpruntWebservice empruntwebSer = empruntweb.getEmpruntWebservicePort();
        List<Emprunt> emprunts = empruntwebSer.getAllEmprunts();
        System.out.println(emprunts.get(0).getId());
        System.out.println(emprunts.get(0).getDateFin());
        System.out.println(emprunts.get(0).isEnCours());
        System.out.println(emprunts.get(0).getIdLivre());
        System.out.println(emprunts.get(0).getIdLivre());
        
        
        Livre_Service livreweb = new Livre_Service();
        LivreWebservice livrewebSer = livreweb.getLivreWebservicePort();
        List<Livre> livres = livrewebSer.getLivres();
        
        for (Livre livre : livres) {
        	System.out.println(livre.getTitre() + " auteur : "+livre.getAuteur().getNom());
        	System.out.println(livre.isDisponible());
     //   	Auteur auteur = getAuteurById(livre.getIdAuteur());
        }
        
        List<Livre> livreRecherchés = livrewebSer.getLivreByRecherche("fouines","");
        System.out.println(livreRecherchés.toString());
    //  List<Auteur>  listeAuteurs = getManagerFactory().getAuteurManager().getAuteurs();

        List<Auteur>  listeAuteurs = managerFactory.getAuteurManager().getAuteurs();
        System.out.println("liste des auteurs");
        System.out.println(listeAuteurs);
        System.out.println("fin");
        
        boolean connexion = managerFactory.getUtilisateurManager().validerLogin("joo", "jooo");
        if(connexion) System.out.println("yeah");
        else System.out.println("pas bon");
    	
        System.out.println("bite");
        
        
    }
}
