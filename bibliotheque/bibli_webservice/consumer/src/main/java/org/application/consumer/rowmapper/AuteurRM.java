package org.application.consumer.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.application.model.Auteur;
import org.springframework.jdbc.core.RowMapper;

public class AuteurRM implements RowMapper<Auteur> {

    @Override
    public Auteur mapRow(ResultSet resultSet, int i) throws SQLException {

        Auteur auteur = new Auteur();
        
        auteur.setNom(resultSet.getString("nom"));
        auteur.setPrenom(resultSet.getString("prenom"));
        auteur.setId(resultSet.getInt("id"));

        return auteur;

    }
}
