package org.core.app.consumer.contract;

import java.util.List;

import org.core.app.model.bean.Editeur;
import org.core.app.model.bean.Ouvrage;

public interface EditeurDao {
	
	List<Editeur> listEditeur();
	
	Editeur find(Integer id);
	
	Editeur searchByOuvrage(Ouvrage ouvrage);
	
	void addEditeur(Editeur editeur);
	
	void updateEditeur(Editeur editeur);
	
	void deleteEditeur(Editeur editeur);

}
