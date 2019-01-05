package org.application.consumer.rowmapper;

import org.application.model.Emprunt;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpruntRM implements RowMapper<Emprunt> {

    @Override
    public Emprunt mapRow(ResultSet rs, int i) throws SQLException {

        Emprunt emprunt = new Emprunt();

        emprunt.setId(rs.getInt("id"));
        emprunt.setDateDebut(rs.getDate("date_emprunt"));
        emprunt.setDateFin(rs.getDate("date_retour"));
        emprunt.setIdLivre(rs.getInt("id_livre"));
        emprunt.setIdUtilisateur(rs.getInt("id_utilisateur"));
        emprunt.setEnCours(rs.getBoolean("en_cours"));
        emprunt.setDejaRepousse(rs.getBoolean("repousse"));
        emprunt.setStatut(rs.getString("statut"));
        emprunt.setRecupere(rs.getBoolean("recupere"));
        emprunt.setMailSent(rs.getBoolean("mail_sent"));

        return emprunt;
    }
}
