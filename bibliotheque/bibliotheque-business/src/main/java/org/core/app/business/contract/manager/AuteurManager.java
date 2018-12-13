package org.core.app.business.contract.manager;

import java.util.List;

import org.core.app.model.bean.Auteur;
import org.core.app.model.exception.NotFoundException;

public interface AuteurManager {
	
	List<Auteur> listAuteur()throws NotFoundException;
	
	Auteur find(Integer id)throws NotFoundException;
	
	List<Auteur> searchAuteurByOuvrageId(Integer id)throws NotFoundException;
	
	void addAuteur(Auteur auteur);
	
	void updateAuteur(Auteur auteur);
	
	void deleteAuteur(Auteur auteur);

}
