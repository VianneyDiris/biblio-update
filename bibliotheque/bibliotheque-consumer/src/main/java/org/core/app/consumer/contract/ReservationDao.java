package org.core.app.consumer.contract;

import org.core.app.model.bean.Ouvrage;
import org.core.app.model.bean.Reservation;
import org.core.app.model.bean.Utilisateur;

import java.util.List;

public interface ReservationDao {

    List<Reservation> listReservation();

    Reservation find(Integer id);

    List<Reservation> searchReservationByOuvrage(Ouvrage ouvrage);

    List<Reservation> searchReservationByUtilisateur(Utilisateur utilisateur);

    void addReservation(Reservation reservation);

    void updateReservation(Reservation reservation);

    void deleteReservation(Reservation reservation);
}
