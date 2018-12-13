package org.core.app.model.bean;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Editeur")
public class Editeur {

	// ==================== Attributs ====================
	private Integer id;
	private String nom;
		
	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
