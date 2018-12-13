package org.core.app.model.bean;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Genre")
public class Genre {
	
	// ==================== Attributs ====================
	private Integer id;
	private String genre;
	
	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
