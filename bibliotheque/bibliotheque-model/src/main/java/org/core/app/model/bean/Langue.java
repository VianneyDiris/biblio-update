package org.core.app.model.bean;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Langue")
public class Langue {
	
	// ==================== Attributs ====================
	private Integer id;
	private String langue;
	private String code;
		
	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
