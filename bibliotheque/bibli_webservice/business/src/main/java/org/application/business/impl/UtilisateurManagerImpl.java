package org.application.business.impl;

import org.application.business.contract.UtilisateurManager;
import org.application.model.Utilisateur;

import java.util.List;

public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {

    public List<Utilisateur> getUtilisateurs() {

        return getDaoFactory().getUtilisateurDAO().getUtilisateurs();
    }

    @Override
    public boolean validerLogin(String mail, String mdp) {
        // TODO Auto-generated method stub
        boolean res = false;
        List<Utilisateur> listeUtilisateurs = getDaoFactory().getUtilisateurDAO().getUtilisateurs();

        for (Utilisateur user : listeUtilisateurs) {
            if (user.getMail().equals(mail)) {
                if (user.getMdp().equals(mdp)) {
                    res = true;
                } else {
                    res = false;
                }
            }
        }
        return res;
    }

    public String encrypt(String mdp) {
        String crypte = "";
        for (int i = 0; i < mdp.length(); i++) {
            int c = mdp.charAt(i) ^ 48;
            crypte = crypte + (char) c;
        }
        return crypte;
    }

    public String decrypt(String mdp) {
        String aCrypter = "";
        for (int i = 0; i < mdp.length(); i++) {
            int c = mdp.charAt(i) ^ 48;
            aCrypter = aCrypter + (char) c;
        }
        return aCrypter;
    }

    @Override
    public Utilisateur getUtilisateurByMail(String mail) {
        return getDaoFactory().getUtilisateurDAO().getUtilisateurByMail(mail);
    }

    @Override
    public void setRappelActif(int idUser) {
        getDaoFactory().getUtilisateurDAO().setRappelActif(idUser);
    }

    @Override
    public void setRappelInActif(int idUser) {
        getDaoFactory().getUtilisateurDAO().setRappelInActif(idUser);
    }

    @Override
    public Utilisateur getUtilisateurById(int idUser) {
        return getDaoFactory().getUtilisateurDAO().getUtilisateurById(idUser);

    }
}
