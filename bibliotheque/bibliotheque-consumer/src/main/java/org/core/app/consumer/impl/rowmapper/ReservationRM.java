package org.core.app.consumer.impl.rowmapper;

import org.core.app.consumer.impl.dao.OuvrageDaoImpl;
import org.core.app.consumer.impl.dao.UtilisateurDaoImpl;
import org.core.app.model.bean.Reservation;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ReservationRM implements RowMapper<Reservation> {
    /**
     * Implementations must implement this method to map each row of data
     * in the ResultSet. This method should not call {@code next()} on
     * the ResultSet; it is only supposed to map values of the current row.
     *
     * @param rs     the ResultSet to map (pre-initialized for the current row)
     * @param rowNum the number of the current row
     * @return the result object for the current row
     * @throws SQLException if a SQLException is encountered getting
     *                      column values (that is, there's no need to catch SQLException)
     */
    @Override
    public Reservation mapRow(ResultSet rs, int rowNum) throws SQLException {
        Reservation reservation = new Reservation();
        reservation.setId(rs.getInt("id"));
        reservation.setDateReservation(rs.getDate("date_reservation"));
        reservation.setNotification(rs.getBoolean("notification"));
        reservation.setDateNotification(rs.getDate("date_notification"));

        OuvrageDaoImpl ouvrageDao = new OuvrageDaoImpl();
        reservation.setOuvrage(ouvrageDao.find(rs.getInt("ouvrage_id")));

        UtilisateurDaoImpl userDao = new UtilisateurDaoImpl();
        reservation.setUtilisateur(userDao.find(rs.getInt("utilisateur_id")));


        return reservation;
    }
}
