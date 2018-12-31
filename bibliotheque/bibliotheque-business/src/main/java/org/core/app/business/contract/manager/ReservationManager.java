package org.core.app.business.contract.manager;

import org.core.app.model.bean.Ouvrage;
import org.core.app.model.bean.Reservation;
import org.core.app.model.exception.NotFoundException;

import java.util.List;

public interface ReservationManager {

    List<Reservation> listReservation() throws NotFoundException;

    Reservation find(Integer id) throws NotFoundException;

    List<Reservation> searchReservationByOuvrage(Ouvrage ouvrage) throws NotFoundException;

    void addReservation(Reservation reservation);

    void updateReservation(Reservation reservation);

    void deleteReservation(Reservation reservation);
}
