package org.application.consumer.rowmapper;

import org.application.model.Reservation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReservationRM implements RowMapper<Reservation> {

    @Override
    public Reservation mapRow(ResultSet rs, int i) throws SQLException {

        Reservation reservation = new Reservation();

        reservation.setIdReservation(rs.getInt("id"));
        reservation.setDateReservation(rs.getDate("date_reservation"));
        reservation.setIdLivre(rs.getInt("id_livre"));
        reservation.setIdUser(rs.getInt("id_user"));

        return reservation;
    }
}
