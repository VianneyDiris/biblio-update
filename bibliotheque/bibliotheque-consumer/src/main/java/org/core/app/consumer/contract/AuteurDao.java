package org.core.app.consumer.contract;

import java.util.List;

import org.core.app.model.bean.Auteur;

public interface AuteurDao {
	
	List<Auteur> listAuteur();
	
	Auteur find(Integer id);
	
	List<Auteur> searchAuteurByOuvrageId(Integer id);
	
	void addAuteur(Auteur auteur);
	
	void updateAuteur(Auteur auteur);
	
	void deleteAuteur(Auteur auteur);

}
