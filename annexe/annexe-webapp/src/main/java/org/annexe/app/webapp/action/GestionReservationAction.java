package org.annexe.app.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import com.vianney.ws.gestionouvrage.Ouvrage;
import com.vianney.ws.gestionreservation.Reservation;

import java.util.List;

public class GestionReservationAction extends ActionSupport {
    // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private Integer id;

    // ----- Paramètres en sortie
    private Ouvrage ouvrage;
    private Reservation reservation;

    // ==================== Getters/Setters ====================

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    // ==================== Méthodes ====================
    public String doListReservation(){

        return ActionSupport.SUCCESS;
    }

    public String doAddReservation(){

        return ActionSupport.SUCCESS;
    }
}
