package org.application.consumer.rowmapper;

import org.application.model.Utilisateur;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilisateurRM implements RowMapper<Utilisateur> {

    @Override
    public Utilisateur mapRow(ResultSet resultSet, int i) throws SQLException {

        Utilisateur utilisateur = new Utilisateur();

        utilisateur.setNom(resultSet.getString("nom"));
        utilisateur.setPrenom(resultSet.getString("prenom"));
        utilisateur.setMail(resultSet.getString("mail"));
        utilisateur.setMdp(resultSet.getString("mdp"));
        
       
        return utilisateur;
    }
}
