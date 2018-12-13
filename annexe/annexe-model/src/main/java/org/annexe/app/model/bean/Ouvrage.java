package org.annexe.app.model.bean;

import java.util.List;

public class Ouvrage {
	
	// ==================== Attributs ====================
	private Integer id;
	private String titre;
	private String photos;
	private String resume;
	private Langue langue;
	private Editeur editeur;
	private long ISBN;
	private Integer exemplaire;
	private List<Genre> listGenre;
	private List<Auteur> listAuteur;

	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getPhotos() {
		return photos;
	}
	public void setPhotos(String photos) {
		this.photos = photos;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public Langue getLangue() {
		return langue;
	}
	public void setLangue(Langue langue) {
		this.langue = langue;
	}
	public Editeur getEditeur() {
		return editeur;
	}
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public Integer getExemplaire() {
		return exemplaire;
	}
	public void setExemplaire(Integer exemplaire) {
		this.exemplaire = exemplaire;
	}
	public List<Genre> getListGenre() {
		return listGenre;
	}
	public void setListGenre(List<Genre> listGenre) {
		this.listGenre = listGenre;
	}
	public List<Auteur> getListAuteur() {
		return listAuteur;
	}
	public void setListAuteur(List<Auteur> listAuteur) {
		this.listAuteur = listAuteur;
	}
	

}
