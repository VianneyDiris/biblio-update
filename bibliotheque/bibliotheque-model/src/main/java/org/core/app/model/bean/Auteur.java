package org.core.app.model.bean;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Auteur")
public class Auteur {
	
	// ==================== Attributs ====================
	private Integer id;
	private String prenom;
	private String nom;
	
	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}	

	
}
