package org.core.app.business.contract.manager;

import java.util.List;

import org.core.app.model.bean.Ouvrage;
import org.core.app.model.exception.NotFoundException;

public interface OuvrageManager {

	List<Ouvrage> listOuvrage()throws NotFoundException;
	
	Ouvrage find(Integer id)throws NotFoundException;
	
	void addOuvrage(Ouvrage ouvrage);
	
	void updateOuvrage(Ouvrage ouvrage);
	
	void deleteOuvrage(Ouvrage ouvrage);
}
