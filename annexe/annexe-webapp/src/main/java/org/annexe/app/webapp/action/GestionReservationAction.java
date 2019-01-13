package org.annexe.app.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import com.vianney.ws.gestionouvrage.Ouvrage;
import com.vianney.ws.gestionreservation.Reservation;
import com.vianney.ws.gestionreservation.Utilisateur;
import org.annexe.app.webapp.convert.ConvertUser;
import org.apache.struts2.interceptor.SessionAware;

import java.util.List;
import java.util.Map;

public class GestionReservationAction extends ActionSupport implements SessionAware {
    // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private Integer id;
    private Map<String, Object> session;
    private Utilisateur user;

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

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    // ==================== Méthodes ====================
    public String doListReservation(){

        return ActionSupport.SUCCESS;
    }

    public String doAddReservation(){
        ConvertUser userConvert = new ConvertUser();
        com.vianney.ws.gestionuser.Utilisateur utilisateur = new com.vianney.ws.gestionuser.Utilisateur();
        utilisateur=(com.vianney.ws.gestionuser.Utilisateur) session.get("user");
        user = userConvert.utilisateurToUtilisateurReservation(utilisateur);

        return ActionSupport.SUCCESS;
    }
}
