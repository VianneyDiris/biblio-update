package org.annexe.app.webapp.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.vianney.ws.gestionouvrage.GestionOuvrage;
import com.vianney.ws.gestionouvrage.GestionOuvrageService;
import com.vianney.ws.gestionouvrage.Ouvrage;

@SuppressWarnings("serial")
public class GestionOuvrageAction extends ActionSupport{
	// ==================== Attributs ====================
	// ----- Paramètres en entrée
	private Integer id;
	
	// ----- Paramètres en sortie
	private List<Ouvrage> listOuvrage;
	private Ouvrage ouvrage;
	
	// ==================== Getters/Setters ====================
	public Ouvrage getOuvrage() {
		return ouvrage;
	}

	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}

	public List<Ouvrage> getListOuvrage() {
		return listOuvrage;
	}

	public void setListOuvrage(List<Ouvrage> listOuvrage) {
		this.listOuvrage = listOuvrage;
	}
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// ==================== Méthodes ====================
	public String doListOuvrage(){
		GestionOuvrageService serviceOuvrage = new GestionOuvrageService();
		GestionOuvrage ouvrageService = serviceOuvrage.getGestionOuvragePort();
		listOuvrage = ouvrageService.getListOuvrage();
		return ActionSupport.SUCCESS;
		
	}
	
	public String doDetail() {
		GestionOuvrageService serviceOuvrage = new GestionOuvrageService();
		GestionOuvrage ouvrageService = serviceOuvrage.getGestionOuvragePort();
		
		ouvrage = ouvrageService.getOuvrageByID(id);
		
		
		return ActionSupport.SUCCESS;
	}
	
	
}
