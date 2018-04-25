package org.application.business.impl;

import java.util.List;

import org.application.business.contract.UtilisateurManager;
import org.application.model.Utilisateur;

public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {

	public List<Utilisateur> getUtilisateurs() {

		return getDaoFactory().getUtilisateurDAO().getUtilisateurs();
	}

	@Override
	public void creerUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualiserUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validerLogin(String mail, String password) {
		// TODO Auto-generated method stub
		boolean res = false;
		List<Utilisateur> listeUtilisateurs = getDaoFactory().getUtilisateurDAO().getUtilisateurs();
		
		for(Utilisateur user : listeUtilisateurs) {
			if(user.getMail().equals(mail)) {
				if(user.getMdp().equals(password)) {
					res = true;
				}
				else {
					res = false;
				}
			}
		}
		return res;
	}

	@Override
	public Utilisateur afficherUtilisateur(String mail) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String encrypt(String password) {
		String crypte = "";
		for (int i = 0; i < password.length(); i++) {
			int c = password.charAt(i) ^ 48;
			crypte = crypte + (char) c;
		}
		return crypte;
	}

	public String decrypt(String password) {
		String aCrypter = "";
		for (int i = 0; i < password.length(); i++) {
			int c = password.charAt(i) ^ 48;
			aCrypter = aCrypter + (char) c;
		}
		return aCrypter;
	}

	@Override
	public boolean validerLogin(Utilisateur utilisateur, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Utilisateur getUtilisateurByEmail(String mail) {
		return getDaoFactory().getUtilisateurDAO().getUtilisateurByEmail(mail);
	}

}
