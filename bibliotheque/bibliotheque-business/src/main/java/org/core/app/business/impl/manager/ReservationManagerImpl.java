package org.core.app.business.impl.manager;

import org.core.app.business.contract.manager.ReservationManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.bean.Reservation;
import org.core.app.model.exception.NotFoundException;

import java.util.List;

public class ReservationManagerImpl extends AbstractManagerImpl implements ReservationManager {
    @Override
    public List<Reservation> listReservation() throws NotFoundException {
        return getDaoFactory().getReservationDao().listReservation();
    }

    @Override
    public Reservation find(Integer id) throws NotFoundException {
        return getDaoFactory().getReservationDao().find(id);
    }

    @Override
    public List<Reservation> searchReservationByOuvrage(Ouvrage ouvrage) throws NotFoundException {
        return getDaoFactory().getReservationDao().searchReservationByOuvrage(ouvrage);
    }

    @Override
    public void addReservation(Reservation reservation) {
        getDaoFactory().getReservationDao().addReservation(reservation);
    }

    @Override
    public void updateReservation(Reservation reservation) {
        getDaoFactory().getReservationDao().updateReservation(reservation);
    }

    @Override
    public void deleteReservation(Reservation reservation) {
        getDaoFactory().getReservationDao().deleteReservation(reservation);
    }
}
