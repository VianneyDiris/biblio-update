package org.core.app.consumer.impl;

import org.core.app.consumer.contract.*;
import org.core.app.model.bean.Reservation;

public class DaoFactoryImpl implements DaoFactory {

	private AuteurDao auteurDao;
	public AuteurDao getAuteurDao() {
		// TODO Auto-generated method stub
		return auteurDao;
	}
		public void setAuteurDao(AuteurDao auteurDao) {
		this.auteurDao = auteurDao;
	}

	private EditeurDao editeurDao;
	public EditeurDao getEditeurDao() {
		// TODO Auto-generated method stub
		return editeurDao;
	}
	public void setEditeurDao(EditeurDao editeurDao) {
		this.editeurDao = editeurDao;
	}
	
	private GenreDao genreDao;
	public GenreDao getGenreDao() {
		// TODO Auto-generated method stub
		return genreDao;
	}
	public void setGenreDao(GenreDao genreDao) {
		this.genreDao = genreDao;
	}
	
	private LangueDao langueDao;
	public LangueDao getLangueDao() {
		// TODO Auto-generated method stub
		return langueDao;
	}
	public void setLangueDao(LangueDao langueDao) {
		this.langueDao = langueDao;
	}
	
	private OuvrageDao ouvrageDao;
	public OuvrageDao getOuvrageDao() {
		// TODO Auto-generated method stub
		return ouvrageDao;
	}
	public void setOuvrageDao(OuvrageDao ouvrageDao) {
		this.ouvrageDao = ouvrageDao;
	}
	
	private PretDao pretDao;
	public PretDao getPretDao() {
		// TODO Auto-generated method stub
		return pretDao;
	}
	public void setPretDao(PretDao pretDao) {
		this.pretDao = pretDao;
	}
	
	private StatusDao statusDao;
	public StatusDao getStatusDao() {
		// TODO Auto-generated method stub
		return statusDao;
	}
	public void setStatusDao(StatusDao statusDao) {
		this.statusDao = statusDao;
	}
	
	private UtilisateurDao utilisateurDao;
	public UtilisateurDao getUtilisateurDao() {
		// TODO Auto-generated method stub
		return utilisateurDao;
	}
	public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}

	private ReservationDao reservationDao;
	public ReservationDao getReservationDao() {
		return reservationDao;
	}

	public void setReservationDao(ReservationDao reservationDao) {
		this.reservationDao = reservationDao;
	}
}
