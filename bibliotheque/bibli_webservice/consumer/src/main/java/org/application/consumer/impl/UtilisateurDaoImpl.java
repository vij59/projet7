package org.application.consumer.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.application.consumer.contract.AbstractDAO;
import org.application.consumer.contract.UtilisateurDAO;
import org.application.consumer.rowmapper.UtilisateurRM;
import org.application.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UtilisateurDaoImpl extends AbstractDAO implements UtilisateurDAO {

	 @Autowired
	    private UtilisateurRM utilisateurRM;

	    public UtilisateurRM getUtilisateurRM() {
	        return utilisateurRM;
	    }

	    public void setUtilisateurRM(UtilisateurRM utilisateurRM) {
	        this.utilisateurRM = utilisateurRM;
	    }

	    
	public List<Utilisateur> getUtilisateurs() {
		String vSQL = "SELECT * FROM utilisateur";

		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

		RowMapper<Utilisateur> vRowMapper = new RowMapper<Utilisateur>() {
			public Utilisateur mapRow(ResultSet pRS, int pRowNum) throws SQLException {
				Utilisateur vUtilisateur = new Utilisateur();
				vUtilisateur.setId(pRS.getInt("id"));
				vUtilisateur.setNom(pRS.getString("nom"));
				vUtilisateur.setPrenom(pRS.getString("prenom"));
				vUtilisateur.setMail(pRS.getString("mail"));
				vUtilisateur.setMdp(pRS.getString("mdp"));
				return vUtilisateur;
			}
		};

		List<Utilisateur> vListeUtilisateurs = vJdbcTemplate.query(vSQL, vRowMapper);

		return vListeUtilisateurs;
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
	public boolean validerLogin(Utilisateur utilisateur, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Utilisateur afficherUtilisateur(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

}
