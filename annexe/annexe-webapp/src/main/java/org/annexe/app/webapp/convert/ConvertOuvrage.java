package org.annexe.app.webapp.convert;

import com.vianney.ws.gestionpret.Editeur;
import com.vianney.ws.gestionpret.Langue;
import com.vianney.ws.gestionpret.Ouvrage;

public class ConvertOuvrage {
	
	public Ouvrage ouvrageToOuvragePret (com.vianney.ws.gestionouvrage.Ouvrage ouvrage) {
		
		Ouvrage livre = new Ouvrage();
		livre.setId(ouvrage.getId());
		livre.setTitre(ouvrage.getTitre());
		livre.setResume(ouvrage.getResume());
		livre.setPhotos(ouvrage.getPhotos());
		livre.setEditeur(editeurToEditeurPret(ouvrage.getEditeur()));
		livre.setLangue(langueToLanguePret(ouvrage.getLangue()));
		livre.setExemplaire(ouvrage.getExemplaire());
		livre.setISBN(ouvrage.getISBN());
		
		return livre;
		
	}
	
	public Editeur editeurToEditeurPret(com.vianney.ws.gestionouvrage.Editeur editeur) {
		Editeur edit = new Editeur();
		edit.setId(editeur.getId());
		edit.setNom(editeur.getNom());
		
		return edit;		
	}
	
	public Langue langueToLanguePret(com.vianney.ws.gestionouvrage.Langue langue) {
		Langue lan = new Langue();
		lan.setId(langue.getId());
		lan.setCode(langue.getCode());
		lan.setLangue(langue.getLangue());
		
		return lan;		
	}


	public com.vianney.ws.gestionreservation.Ouvrage ouvrageToOuvrageReservation (com.vianney.ws.gestionouvrage.Ouvrage ouvrage) {

		com.vianney.ws.gestionreservation.Ouvrage livre = new com.vianney.ws.gestionreservation.Ouvrage();
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

	public com.vianney.ws.gestionreservation.Editeur editeurToEditeurReservation(com.vianney.ws.gestionouvrage.Editeur editeur) {
		com.vianney.ws.gestionreservation.Editeur edit = new com.vianney.ws.gestionreservation.Editeur();
		edit.setId(editeur.getId());
		edit.setNom(editeur.getNom());

		return edit;
	}

	public com.vianney.ws.gestionreservation.Langue langueToLangueReservation(com.vianney.ws.gestionouvrage.Langue langue) {
		com.vianney.ws.gestionreservation.Langue lan = new com.vianney.ws.gestionreservation.Langue();
		lan.setId(langue.getId());
		lan.setCode(langue.getCode());
		lan.setLangue(langue.getLangue());

		return lan;
	}



}
