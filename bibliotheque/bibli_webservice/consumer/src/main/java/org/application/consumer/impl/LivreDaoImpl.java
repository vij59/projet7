package org.application.consumer.impl;

import org.application.consumer.contract.AbstractDAO;
import org.application.consumer.contract.LivreDAO;
import org.application.consumer.rowmapper.LivreRM;
import org.application.model.Auteur;
import org.application.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.sql.Types;
import java.util.List;

public class LivreDaoImpl extends AbstractDAO implements LivreDAO {

    @Autowired
    private LivreRM livreRM;

    public LivreRM getLivreRM() {
        return livreRM;
    }

    public void setLivreRM(LivreRM livreRM) {
        this.livreRM = livreRM;
    }

    @Override
    public void creer(Livre livre) {

        String vSQL = "INSERT INTO public.livre (id, titre, id_auteur, date_publication, nb_exemplaires, disponible) VALUES(:id, :titre, :id_auteur, :date_publication, :nb_exemplaires, :disponible)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", livre.getId(), Types.INTEGER);
        vParams.addValue("titre", livre.getTitre(), Types.VARCHAR);
        vParams.addValue("id_auteur", livre.getIdAuteur(), Types.INTEGER);
        vParams.addValue("date_publication", livre.getAnneeSortie(), Types.DATE);
        vParams.addValue("nb_exemplaires", livre.getNbExemplaires(), Types.INTEGER);
        boolean disponibility = true;
        disponibility = livre.getNbExemplaires() > 0;
        vParams.addValue("disponible", disponibility, Types.BOOLEAN);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public Livre getLivreById(int id) {

        String vSQL = "SELECT * FROM livre WHERE id = :id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", id);
        try {
            Livre livre = vJdbcTemplate.queryForObject(vSQL, vParams, livreRM);
            return livre;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }

    @Override
    public List<Livre> getLivres() {

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String sql = "SELECT * FROM livre";

        List<Livre> vList = vJdbcTemplate.query(sql, livreRM);
        return vList;

    }

    @Override
    public List<Livre> getLivreByTitre(String titre) {

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String var = "'" + titre + "'";
        String vSQL = "SELECT * FROM livre WHERE titre = " + var;

        try {
            List<Livre> livres = vJdbcTemplate.query(vSQL, livreRM);
            return livres;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }

    }

    @Override
    public List<Livre> getLivreByAuteur(Auteur auteur) {

        String vSQL = "SELECT * FROM public.livre WHERE author_id=:author_id";

        SqlParameterSource vParams = new BeanPropertySqlParameterSource(auteur);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        List<Livre> vList = vJdbcTemplate.query(vSQL, vParams, livreRM);
        return vList;

    }

    @Override
    public List<Livre> getLivreByRecherche(String titre, String auteur) {

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String vSQL;

        String var1 = "'" + titre + "'";
        String var2 = "'" + auteur + "'";
        if (titre.equals("") && (auteur.equals(""))) {
            vSQL = "SELECT * FROM livre";
        } else if (!titre.equals("") && (auteur.equals(""))) {
            vSQL = "SELECT * FROM livre  WHERE titre = " + var1;
        } else if (titre.equals("") && (!auteur.equals(""))) {
            vSQL = "SELECT * FROM livre l,auteur a WHERE l.id_auteur = a.id and  nom =" + var2;
        } else {
            vSQL = "SELECT * FROM livre l,auteur a WHERE l.id_auteur = a.id and titre = " + var1 + " and nom =" + var2;
        }

        try {
            List<Livre> livres = vJdbcTemplate.query(vSQL, livreRM);
            return livres;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }

    }

}
