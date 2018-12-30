package org.core.app.model.bean;

import javax.xml.bind.annotation.XmlType;
import java.time.LocalDateTime;

@XmlType(name = "Reservation")
public class Reservation {

    private Integer id;
    private LocalDateTime dateReservation;
    private Ouvrage ouvrage;
    private Utilisateur utilisateur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDateTime dateReservation) {
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
