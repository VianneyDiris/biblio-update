package org.annexe.app.webapp.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.vianney.ws.gestionouvrage.GestionOuvrage;
import com.vianney.ws.gestionouvrage.GestionOuvrageService;
import com.vianney.ws.gestionouvrage.Ouvrage;
import com.vianney.ws.gestionpret.GestionPret;
import com.vianney.ws.gestionpret.GestionPretService;
import com.vianney.ws.gestionpret.Pret;
import org.annexe.app.webapp.convert.ConvertOuvrage;

@SuppressWarnings("serial")
public class GestionOuvrageAction extends ActionSupport{
	// ==================== Attributs ====================
	// ----- Paramètres en entrée
	private Integer id;
	
	// ----- Paramètres en sortie
	private List<Ouvrage> listOuvrage;
	private Ouvrage ouvrage;
	private boolean reservation;
	
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

	public boolean isReservation() {
		return reservation;
	}

	public void setReservation(boolean reservation) {
		this.reservation = reservation;
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
		reservation=false;

		GestionPretService servicePret = new GestionPretService();
		GestionPret pretService = servicePret.getGestionPretPort();
		ConvertOuvrage convert = new ConvertOuvrage();
		List<Pret> listPret = pretService.getListPretByOuvrage(convert.ouvrageToOuvragePret(ouvrage));

		int pretEnCours = 0;
		for(Pret pret :listPret){
			if(pret.getStatus().getId()==1){
				pretEnCours+=1;
			}
		}

		if (pretEnCours==ouvrage.getExemplaire()){
			reservation=true;
		}

		return ActionSupport.SUCCESS;
	}
	
	
}
