package com.vianney.ws.gestionreservation;

import org.core.app.business.impl.ManagerFactoryImpl;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.bean.Reservation;
import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;

import java.util.List;

public class GestionReservationImpl implements GestionReservation {

    private ManagerFactoryImpl managerFactory;
    public ManagerFactoryImpl getManagerFactory() {
        return managerFactory;
    }
    public void setManagerFactory(ManagerFactoryImpl managerFactory) {
        this.managerFactory = managerFactory;
    }

    @Override
    public List<Reservation> listReservation() {
        List<Reservation> reservationList = null;
        try {
            reservationList = managerFactory.getReservationManager().listReservation();
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return reservationList;
    }

    @Override
    public Reservation find(Integer id) {
        Reservation reservation = null;
        try {
            reservation = managerFactory.getReservationManager().find(id);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return reservation;
    }

    @Override
    public List<Reservation> searchReservationByOuvrage(Ouvrage ouvrage) {
        List<Reservation> reservationList = null;
        try {
            reservationList = managerFactory.getReservationManager().searchReservationByOuvrage(ouvrage);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return reservationList;
    }

    @Override
    public List<Reservation> searchReservationByUtilisateur(Utilisateur utilisateur) {
        List<Reservation> reservationList = null;
        try {
            reservationList = managerFactory.getReservationManager().searchReservationByUtilisateur(utilisateur);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return reservationList;
    }

    @Override
    public void addReservation(Reservation reservation) {
        managerFactory.getReservationManager().addReservation(reservation);
    }

    @Override
    public void updateReservation(Reservation reservation) {
        managerFactory.getReservationManager().updateReservation(reservation);
    }

    @Override
    public void deleteReservation(Reservation reservation) {
        managerFactory.getReservationManager().deleteReservation(reservation);
    }
}
