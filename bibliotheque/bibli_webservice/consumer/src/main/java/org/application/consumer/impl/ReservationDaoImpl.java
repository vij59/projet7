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
    public void creerReservation(Reservation reservationRM) {

        String vSQL = "INSERT INTO reservation (id_user, id_livre, date_reservation) "
                + "VALUES( :idUser,:idLivre, :dateReservation)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();

        // Date now = new Date();
        // Date d2 = new Date();
        Calendar now = Calendar.getInstance();
        Date dateReservation = now.getTime();
        vParams.addValue("dateReservation", dateReservation, Types.DATE);
        vParams.addValue("idLivre", reservationRM.getIdLivre(), Types.INTEGER);
        vParams.addValue("idUtilisateur", reservationRM.getIdUser(), Types.INTEGER);

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
