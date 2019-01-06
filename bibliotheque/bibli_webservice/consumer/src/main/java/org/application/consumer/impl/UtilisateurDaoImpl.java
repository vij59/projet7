package org.application.consumer.impl;

import org.application.consumer.contract.AbstractDAO;
import org.application.consumer.contract.UtilisateurDAO;
import org.application.consumer.rowmapper.UtilisateurRM;
import org.application.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

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

        List<Utilisateur> vListeUtilisateurs = vJdbcTemplate.query(vSQL, utilisateurRM);

        return vListeUtilisateurs;
    }

    @Override
    public Utilisateur getUtilisateurByMail(String mail) {
        // TODO Auto-generated method stub

        String vSQL = "SELECT * FROM utilisateur where mail = :mail";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("mail", mail);

        try {
            Utilisateur utilisateur = vJdbcTemplate.queryForObject(vSQL, vParams, utilisateurRM);
            return utilisateur;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }

    @Override
    public void setRappelActif(int idUser) {
        // TODO Auto-generated method stub

        String vSQL = "UPDATE utilisateur SET  rappel=true where id = :idUser";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("idUser", idUser);
        vJdbcTemplate.update(vSQL, vParams);
    }

    @Override
    public void setRappelInActif(int idUser) {
        // TODO Auto-generated method stub

        String vSQL = "UPDATE utilisateur SET  rappel=false where id = :idUser";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("idUser", idUser);
        vJdbcTemplate.update(vSQL, vParams);
    }

    @Override
    public Utilisateur getUtilisateurById(int idUser) {
        // TODO Auto-generated method stub

        String vSQL = "SELECT * FROM utilisateur where id = :idUser";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("idUser", idUser);

        try {
            Utilisateur utilisateur = vJdbcTemplate.queryForObject(vSQL, vParams, utilisateurRM);
            return utilisateur;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }

}
