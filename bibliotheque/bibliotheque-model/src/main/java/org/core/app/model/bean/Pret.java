package org.core.app.model.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;
@XmlType(name = "Pret")
public class Pret {
	
	// ==================== Attributs ====================
	private Integer id;
	private Utilisateur utilisateur;
	private Ouvrage ouvrage;
	private Status status;
	private Date date_debut;
	private Date date_fin;
	private boolean prolongation;
	
	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Ouvrage getOuvrage() {
		return ouvrage;
	}
	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public boolean isProlongation() {
		return prolongation;
	}
	public void setProlongation(boolean prolongation) {
		this.prolongation = prolongation;
	}	

}
