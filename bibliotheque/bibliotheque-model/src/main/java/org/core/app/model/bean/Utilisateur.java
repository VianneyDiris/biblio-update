package org.core.app.model.bean;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Utilisateur")
public class Utilisateur {
	
	// ==================== Attributs ====================
	private Integer id;
	private String nom;
	private String prenom;
	private String mail;
	private String password;
	private boolean expiration;
	
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isExpiration() {
		return expiration;
	}

	public void setExpiration(boolean expiration) {
		this.expiration = expiration;
	}
}
