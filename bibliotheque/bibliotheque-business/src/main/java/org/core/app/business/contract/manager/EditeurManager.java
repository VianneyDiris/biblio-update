package org.core.app.business.contract.manager;

import java.util.List;

import org.core.app.model.bean.Editeur;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.exception.NotFoundException;

public interface EditeurManager {
	
	List<Editeur> listEditeur()throws NotFoundException;
	
	Editeur find(Integer id)throws NotFoundException;
	
	Editeur searchByOuvrage(Ouvrage ouvrage)throws NotFoundException;
	
	void addEditeur(Editeur editeur);
	
	void updateEditeur(Editeur editeur);
	
	void deleteEditeur(Editeur editeur);

}
