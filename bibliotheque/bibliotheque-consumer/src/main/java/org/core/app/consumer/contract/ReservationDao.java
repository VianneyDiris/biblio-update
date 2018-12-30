package org.core.app.consumer.contract;

import org.core.app.model.bean.Ouvrage;
import org.core.app.model.bean.Reservation;

import java.util.List;

public interface ReservationDao {

    List<Reservation> listReservation();

    Reservation find(Integer id);

    List<Reservation> searchReservationByOuvrage(Ouvrage ouvrage);

    void addReservation(Reservation reservation);

    void updateReservation(Reservation reservation);

    void deleteReservation(Reservation reservation);
}
