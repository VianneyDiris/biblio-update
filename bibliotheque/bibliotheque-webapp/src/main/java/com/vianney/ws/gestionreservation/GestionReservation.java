package com.vianney.ws.gestionreservation;

import org.core.app.model.bean.Ouvrage;
import org.core.app.model.bean.Reservation;
import org.core.app.model.bean.Utilisateur;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(name ="GestionReservation")
public interface GestionReservation {

    @WebMethod
    public List<Reservation> listReservation();

    @WebMethod
    public Reservation find(Integer id);

    @WebMethod
    public List<Reservation> searchReservationByOuvrage(Ouvrage ouvrage);

    @WebMethod
    public List<Reservation> searchReservationByUtilisateur(Utilisateur utilisateur);

    @WebMethod
    public void addReservation(Reservation reservation);

    @WebMethod
    public void updateReservation(Reservation reservation);

    @WebMethod
    public void deleteReservation(Reservation reservation);
}
