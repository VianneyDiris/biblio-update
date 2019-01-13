package org.annexe.app.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import com.vianney.ws.gestionouvrage.Ouvrage;
import com.vianney.ws.gestionreservation.Reservation;
import org.apache.struts2.interceptor.SessionAware;

import java.util.List;
import java.util.Map;

public class GestionReservationAction extends ActionSupport implements SessionAware {
    // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private Integer id;
    private Map<String, Object> session;

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
    public Map<String, Object> getSession() {
        return session;
    }
    public void setSession(Map<String, Object> pSession) {
        // TODO Auto-generated method stub
        this.session=pSession;
    }

    // ==================== Méthodes ====================
    public String doListReservation(){

        return ActionSupport.SUCCESS;
    }

    public String doAddReservation(){

        return ActionSupport.SUCCESS;
    }
}
