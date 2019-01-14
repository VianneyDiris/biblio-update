package com.batch.app.task;

import com.vianney.ws.gestionreservation.Editeur;
import com.vianney.ws.gestionreservation.Langue;
import com.vianney.ws.gestionreservation.Ouvrage;

public class ConvertOuvrage {

    public Ouvrage ouvrageToOuvrageReservation (com.vianney.ws.gestionpret.Ouvrage ouvrage) {

        Ouvrage livre = new com.vianney.ws.gestionreservation.Ouvrage();
        livre.setId(ouvrage.getId());
        livre.setTitre(ouvrage.getTitre());
        livre.setResume(ouvrage.getResume());
        livre.setPhotos(ouvrage.getPhotos());
        livre.setEditeur(editeurToEditeurReservation(ouvrage.getEditeur()));
        livre.setLangue(langueToLangueReservation(ouvrage.getLangue()));
        livre.setExemplaire(ouvrage.getExemplaire());
        livre.setISBN(ouvrage.getISBN());

        return livre;

    }

    public Editeur editeurToEditeurReservation(com.vianney.ws.gestionpret.Editeur editeur) {
        com.vianney.ws.gestionreservation.Editeur edit = new com.vianney.ws.gestionreservation.Editeur();
        edit.setId(editeur.getId());
        edit.setNom(editeur.getNom());

        return edit;
    }

    public Langue langueToLangueReservation(com.vianney.ws.gestionpret.Langue langue) {
        Langue lan = new com.vianney.ws.gestionreservation.Langue();
        lan.setId(langue.getId());
        lan.setCode(langue.getCode());
        lan.setLangue(langue.getLangue());

        return lan;
    }
}
