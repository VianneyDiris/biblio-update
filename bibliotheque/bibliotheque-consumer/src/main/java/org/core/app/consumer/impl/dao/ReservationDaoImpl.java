package org.core.app.consumer.impl.dao;

import org.core.app.consumer.contract.ReservationDao;
import org.core.app.consumer.impl.AbstractDaoImpl;
import org.core.app.consumer.impl.rowmapper.ReservationRM;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.bean.Reservation;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ReservationDaoImpl extends AbstractDaoImpl implements ReservationDao {
    @Override
    public List<Reservation> listReservation() {
        String vsql="SELECT * FROM public.reservation";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        ReservationRM rowReservation = new ReservationRM();

        List<Reservation> reservationList = vJdbcTemplate.query(vsql,rowReservation);
        return reservationList;
    }

    @Override
    public Reservation find(Integer id) {
        String vsql="SELECT * FROM public.reservation WHERE id=?";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        ReservationRM rowReservation = new ReservationRM();
        Reservation reservation =(Reservation) vJdbcTemplate.queryForObject(vsql, new Object[] { id }, rowReservation);
        return reservation;
    }

    @Override
    public List<Reservation> searchReservationByOuvrage(Ouvrage ouvrage) {
        String vsql="SELECT * FROM public.reservation WHERE ouvrage_id=?";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        ReservationRM rowReservation = new ReservationRM();

        List<Reservation> listReservation = vJdbcTemplate.query(vsql, new Object[] { ouvrage.getId() },rowReservation);

        return listReservation;
    }

    @Override
    public void addReservation(Reservation reservation) {
        String vsql = "INSERT INTO public.reservation (utilisateur_id,ouvrage_id,date_reservation) VALUES (?,?,?)";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        vJdbcTemplate.update(vsql,reservation.getUtilisateur().getId(),reservation.getOuvrage().getId(),reservation.getDateReservation());
    }

    @Override
    public void updateReservation(Reservation reservation) {
        String vSQL = "UPDATE public.reservation SET utilisateur_id =?, ouvrage_id=?, date_reservation=? WHERE id = ?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSQL,reservation.getUtilisateur().getId(),reservation.getOuvrage().getId(),reservation.getDateReservation(),reservation.getId());
    }

    @Override
    public void deleteReservation(Reservation reservation) {
        String vsql="DELETE FROM public.reservation WHERE id=?";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        vJdbcTemplate.update(vsql,new Object[] { reservation.getId() });
    }
}
