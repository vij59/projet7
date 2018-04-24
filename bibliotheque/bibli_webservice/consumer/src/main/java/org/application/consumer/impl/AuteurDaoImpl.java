package org.application.consumer.impl;


import java.sql.Types;
import java.util.List;

import javax.inject.Inject;

import org.application.consumer.contract.AbstractDAO;
import org.application.consumer.contract.AuteurDAO;
import org.application.consumer.rowmapper.AuteurRM;
import org.application.model.Auteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class AuteurDaoImpl extends AbstractDAO implements AuteurDAO {

    @Autowired
    private AuteurRM auteurRM;

    public AuteurRM getAuteurRM() {
        return auteurRM;
    }

    public void setAuteurRM(AuteurRM auteurRM) {
        this.auteurRM = auteurRM;
    }

    @Override
    public void creer(Auteur auteur) {

        String vSQL = "INSERT INTO auteur (nom, prenom) VALUES(:nom, :prenom)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom", auteur.getNom(), Types.VARCHAR);
        vParams.addValue("prenom", auteur.getPrenom(), Types.VARCHAR);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }


    @Override
    public List<Auteur> getAuteurs() {

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String sql = "SELECT * FROM auteur";

        return vJdbcTemplate.query(sql,auteurRM);
    }

    @Override
    public List<Auteur> getByNom(String nom) {

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String var = "'"+nom+"'";
        String vSQL = "SELECT * FROM auteur WHERE nom = "+var;

        try {
            List<Auteur> auteurs = vJdbcTemplate.query(vSQL,auteurRM);
            return auteurs;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }


    @Override
    public Auteur getAuteurById(int id) {

       // JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        
        String vSQL = "SELECT * FROM auteur WHERE id = :id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", id);

        try {
            Auteur auteur = vJdbcTemplate.queryForObject(vSQL, vParams, auteurRM);
            return auteur;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }
    
}
