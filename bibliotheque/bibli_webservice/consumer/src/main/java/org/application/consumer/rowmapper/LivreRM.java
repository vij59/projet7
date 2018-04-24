package org.application.consumer.rowmapper;

import org.application.model.Livre;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class LivreRM implements RowMapper<Livre> {

    @Override
    public Livre mapRow(ResultSet resultSet, int i) throws SQLException {

        Livre livre = new Livre();

        livre.setId(resultSet.getInt("id"));
        livre.setTitre(resultSet.getString("titre"));
        livre.setAnneeSortie(resultSet.getDate("date_publication"));
        livre.setIdAuteur(resultSet.getInt("id_auteur"));
        livre.setNbExemplaires(resultSet.getInt("nb_exemplaires"));
        livre.setDisponible(resultSet.getBoolean("disponible"));
       
       
        return livre;
    }
}
