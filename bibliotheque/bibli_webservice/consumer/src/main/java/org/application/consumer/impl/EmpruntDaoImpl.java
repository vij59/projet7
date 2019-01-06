package org.application.consumer.impl;

import org.apache.commons.lang3.time.DateUtils;
import org.application.consumer.contract.AbstractDAO;
import org.application.consumer.contract.EmpruntDAO;
import org.application.consumer.rowmapper.EmpruntRM;
import org.application.model.Emprunt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.Types;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class EmpruntDaoImpl extends AbstractDAO implements EmpruntDAO {

    @Autowired
    private EmpruntRM empruntRM;

    public EmpruntRM getEmpruntRM() {
        return empruntRM;
    }

    public void setEmpruntRM(EmpruntRM empruntRM) {
        this.empruntRM = empruntRM;
    }

    @Override
    public void creerEmprunt(Emprunt empruntRM) {

        String vSQL = "INSERT INTO emprunt (date_emprunt, date_retour, id_livre, id_utilisateur,en_cours,repousse) "
                + "VALUES( :dateDebut, :dateFin, :idLivre, :idUtilisateur, :enCours, :repousse)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();

        // Date now = new Date();
        // Date d2 = new Date();
        Calendar now = Calendar.getInstance();
        Date now1 = now.getTime();
        vParams.addValue("dateDebut", now1, Types.DATE);
        now.add(Calendar.DATE, 2);
        Date now2 = now.getTime();
        vParams.addValue("dateFin", now2, Types.DATE);
        vParams.addValue("idLivre", empruntRM.getIdLivre(), Types.INTEGER);
        vParams.addValue("idUtilisateur", empruntRM.getIdUtilisateur(), Types.INTEGER);
        vParams.addValue("enCours", true, Types.BOOLEAN);
        vParams.addValue("repousse", false, Types.BOOLEAN);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }

    @Override
    public List<Emprunt> getListeEmprunts() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String sql = "SELECT * FROM emprunt";

        List<Emprunt> vList = vJdbcTemplate.query(sql, empruntRM);
        return vList;
    }

    @Override
    public List<Emprunt> getListeEmpruntsEnCours() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String sql = "SELECT * FROM emprunt where en_cours=true";

        List<Emprunt> vList = vJdbcTemplate.query(sql, empruntRM);
        return vList;
    }

    @Override
    public void empruntProlonge(int idEmprunt) {
        String vSQL = "UPDATE emprunt SET  date_retour=:dateFin, repousse=true WHERE id=:id";
        Date dateFin = null;
        List<Emprunt> listeEmprunts = getListeEmprunts();
        for (Emprunt emp : listeEmprunts) {
            if (emp.getId() == idEmprunt) {
                dateFin = emp.getDateFin();
            }
        }
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", idEmprunt, Types.INTEGER);
        Date newDate = DateUtils.addMonths(dateFin, 1);
        vParams.addValue("dateFin", newDate, Types.DATE);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);
    }

    @Override
    public List<Emprunt> getEmpruntByUserId(int idUser) {
        String vSQL = "SELECT * FROM emprunt WHERE id_utilisateur = :id   order by en_cours desc, repousse desc, date_retour asc ";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", idUser);
        try {
            List<Emprunt> emprunts = vJdbcTemplate.query(vSQL, vParams, empruntRM);
            return emprunts;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }

    @Override
    public Emprunt getEmpruntById(int idEmprunt) {
        String vSQL = "SELECT * FROM emprunt WHERE id = :id order by en_cours desc, repousse desc, date_retour asc ";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", idEmprunt);
        try {
            Emprunt emprunt = vJdbcTemplate.queryForObject(vSQL, vParams, empruntRM);

            return emprunt;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }

    @Override
    public List<Emprunt> getEmpruntsEnCours() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String sql = "SELECT * FROM emprunt WHERE en_cours = true";

        List<Emprunt> vList = vJdbcTemplate.query(sql, empruntRM);
        return vList;
    }

    // méthode qui va mettre fin à l'emprunt, et donc permet de rendre le livre
    @Override
    public void rendreLivreDeLemprunt(int idEmprunt) {
        String vSQL = "UPDATE emprunt SET  date_retour=:dateFin, en_cours=false , statut=:statut WHERE id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        Calendar now = Calendar.getInstance();
        Date now1 = now.getTime();
        vParams.addValue("dateFin", now1, Types.DATE);
        vParams.addValue("statut", "rendu", Types.VARCHAR);
        vParams.addValue("id", idEmprunt, Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);
    }

    // méthode qui va permettre de valider l'emprunt une fois transferé de la reservation
    @Override
    public void recupererLivre(int idEmprunt) {
        String vSQL = "UPDATE emprunt SET date_emprunt=:dateDebut , date_retour=:dateFin, en_cours=true , recupere=true  WHERE id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        Calendar now = Calendar.getInstance();
        Date now1 = now.getTime();
        vParams.addValue("dateDebut", now1, Types.DATE);
        now.add(Calendar.MONTH, 1);
        Date now2 = now.getTime();
        vParams.addValue("dateFin", now2, Types.DATE);
        vParams.addValue("id", idEmprunt, Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);
    }

    // méthode qui va permettre de valider l'emprunt une fois transferé de la reservation
    @Override
    public void livreNonRecupereByIdEmprunt(int idEmprunt) {
        String vSQL = "DELETE FROM emprunt  WHERE id=:id";
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", idEmprunt, Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);
    }

    @Override
    public Date getDateRetourPlusProche(int idLivre) {
        Date dateRetour = new Date();
        String vSQL = "SELECT date_retour FROM emprunt WHERE  " +
                "id=(SELECT MIN(id) from emprunt where en_cours=true and id_livre = :id) ";

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", idLivre);
        try {
            dateRetour = vJdbcTemplate.queryForObject(vSQL, vParams, Date.class);

        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
        return dateRetour;
    }

    @Override
    public List<Emprunt> getEmpruntsEnCoursByUserId(int idUser) {
        String vSQL = "SELECT * FROM emprunt WHERE  " +
                "id_utilisateur = :id and en_cours=true ";

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", idUser);
        try {
            List<Emprunt> emprunts = vJdbcTemplate.query(vSQL, vParams, empruntRM);
            return emprunts;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }

    @Override
    public void setMailSentByEmpruntId(int id) {
        String vSQL = "UPDATE emprunt SET mail_sent=true  WHERE id=:id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", id, Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);
    }
}
