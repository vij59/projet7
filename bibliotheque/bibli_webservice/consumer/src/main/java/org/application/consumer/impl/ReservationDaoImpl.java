package org.application.consumer.impl;

import org.application.consumer.contract.AbstractDAO;
import org.application.consumer.contract.ReservationDAO;

import org.application.consumer.rowmapper.ReservationRM;
import org.application.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.Types;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
    public void creerReservation(int idUser, int idLivre) {

        String vSQL = "INSERT INTO reservation (id_user, id_livre) "
                + "VALUES( :idUser,:idLivre)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();


//        Calendar now = Calendar.getInstance();
//        Date dateReservation = now.getTime();
        java.util.Date date = new java.util.Date(System.currentTimeMillis());
        java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());

        //vParams.addValue("dateReservation", timestamp, Types.TIMESTAMP);
      //  vParams.addValue("idLivre", preservation.getIdLivre(), Types.INTEGER);
     //   vParams.addValue("idUser", preservation.getIdUser(), Types.INTEGER);

        vParams.addValue("idLivre", idLivre, Types.INTEGER);
        vParams.addValue("idUser", idUser, Types.INTEGER);

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

}
