package org.core.app.model.bean;

import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(name = "Reservation")
public class Reservation {

    private Integer id;
    private Date dateReservation;
    private Ouvrage ouvrage;
    private Utilisateur utilisateur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
