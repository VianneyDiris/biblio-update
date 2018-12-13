package org.core.app.business.impl;

import org.core.app.business.contract.ManagerFactory;
import org.core.app.business.contract.manager.AuteurManager;
import org.core.app.business.contract.manager.EditeurManager;
import org.core.app.business.contract.manager.GenreManager;
import org.core.app.business.contract.manager.LangueManager;
import org.core.app.business.contract.manager.OuvrageManager;
import org.core.app.business.contract.manager.PretManager;
import org.core.app.business.contract.manager.StatusManager;
import org.core.app.business.contract.manager.UtilisateurManager;

public class ManagerFactoryImpl implements ManagerFactory {

	private AuteurManager auteurManager;
	public AuteurManager getAuteurManager() {
		// TODO Auto-generated method stub
		return auteurManager;
	}
	public void setAuteurManager(AuteurManager auteurManager) {
		this.auteurManager = auteurManager;
	}

	private EditeurManager editeurManager;
	public EditeurManager getEditeurManager() {
		// TODO Auto-generated method stub
		return editeurManager;
	}
	public void setEditeurManager(EditeurManager editeurManager) {
		this.editeurManager = editeurManager;
	}
	
	private GenreManager genreManager;
	public GenreManager getGenreManager() {
		// TODO Auto-generated method stub
		return genreManager;
	}
	public void setGenreManager(GenreManager genreManager) {
		this.genreManager = genreManager;
	}
	
	private LangueManager langueManager;
	public LangueManager getLangueManager() {
		// TODO Auto-generated method stub
		return langueManager;
	}
	public void setLangueManager(LangueManager langueManager) {
		this.langueManager = langueManager;
	}
	
	private OuvrageManager ouvrageManager;
	public OuvrageManager getOuvrageManager() {
		// TODO Auto-generated method stub
		return ouvrageManager;
	}
	public void setOuvrageManager(OuvrageManager ouvrageManager) {
		this.ouvrageManager = ouvrageManager;
	}
	
	private PretManager pretManager;
	public PretManager getPretManager() {
		// TODO Auto-generated method stub
		return pretManager;
	}
	public void setPretManager(PretManager pretManager) {
		this.pretManager = pretManager;
	}
	
	private StatusManager statusManager;
	public StatusManager getStatusManager() {
		// TODO Auto-generated method stub
		return statusManager;
	}
	public void setStatusManager(StatusManager statusManager) {
		this.statusManager = statusManager;
	}
	
	private UtilisateurManager utilisateurManager;
	public UtilisateurManager getUtilisateurManager() {
		// TODO Auto-generated method stub
		return utilisateurManager;
	}
	public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
		this.utilisateurManager = utilisateurManager;
	}
	

}
