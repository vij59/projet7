package org.application.consumer.impl;

import org.application.consumer.contract.AbstractDAO;
import org.application.consumer.contract.ReservationDAO;
import org.application.consumer.rowmapper.ReservationRM;
import org.application.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.Types;
import java.util.List;

import static java.lang.System.currentTimeMillis;

public class ReservationDaoImpl extends AbstractDAO implements ReservationDAO {

    @Autowired
    private ReservationRM reservationRM;

    public ReservationRM getReservationRM() {
        return reservationRM;
    }

    public void setReservationRM(ReservationRM reservationRM) {
        this.reservationRM = reservationRM;
    }

    @Override
    public void creerReservation(Reservation reservation) {

        String vSQL = "INSERT INTO reservation (id_user, id_livre, date_reservation) "
                + "VALUES( :idUser,:idLivre, :dateReservation)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();


//        Calendar now = Calendar.getInstance();
//        Date dateReservation = now.getTime();
        java.util.Date date = new java.util.Date(currentTimeMillis());
        java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());


        //  vParams.addValue("idLivre", preservation.getIdLivre(), Types.INTEGER);
        //  vParams.addValue("idUser", preservation.getIdUser(), Types.INTEGER);

        vParams.addValue("idUser", reservation.getIdUser(), Types.INTEGER);
        vParams.addValue("idLivre", reservation.getIdLivre(), Types.INTEGER);
        vParams.addValue("dateReservation", timestamp, Types.TIMESTAMP);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);

    }


    @Override
    public List<Reservation> getListeReservations() {

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String sql = "SELECT * FROM reservation";

        List<Reservation> vList = vJdbcTemplate.query(sql, reservationRM);
        return vList;

    }

    @Override
    public List<Reservation> getReservationsByBookId(int idLivre) {

        String vSQL = "SELECT * FROM reservation WHERE id_livre = :id ";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", idLivre);
        try {
            List<Reservation> vList = vJdbcTemplate.query(vSQL, vParams, reservationRM);
            return vList;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }

    @Override
    public void supprimerReservation(Reservation reservation) {
        String vSQL = "DELETE FROM reservation WHERE id = :id";
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", reservation.getIdReservation(), Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);
    }

    @Override
    public List<Reservation> getReservationsByUserId(int idUser) {

        String vSQL = "SELECT * FROM reservation WHERE id_user = :id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", idUser);
        try {
            List<Reservation> vList = vJdbcTemplate.query(vSQL, vParams, reservationRM);
            return vList;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }

    @Override
    public void annulerReservation(int idLivre, int idUser) {
        String vSQL = "DELETE FROM reservation WHERE id_livre = :idLivre AND id_user = :idUser";
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("idLivre", idLivre, Types.INTEGER);
        vParams.addValue("idUser", idUser, Types.INTEGER);
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL, vParams);
    }

    @Override
    public int getNombreDeReservationsPourLivreId(int idLivre) {
        int nbReservations = 0;
        String vSQL = "SELECT COUNT(*) FROM reservation WHERE id_livre = :id";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource("id", idLivre);
        try {
            nbReservations = vJdbcTemplate.queryForObject(vSQL, vParams, Integer.class);

        } catch (EmptyResultDataAccessException vEx) {
            return 0;
        }
        return nbReservations;
    }

    @Override
    public Reservation getReservationByBookIdByUserId(int pIdLivre, int pIdUser) {
        String vSQL = "SELECT * FROM reservation WHERE id_user = :id and id_livre = :idLivre";
        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", pIdUser, Types.INTEGER);
        vParams.addValue("idLivre", pIdLivre, Types.INTEGER);
        try {
            Reservation reservation = vJdbcTemplate.queryForObject(vSQL, vParams, reservationRM);
            return reservation;
        } catch (EmptyResultDataAccessException vEx) {
            return null;
        }
    }


}
