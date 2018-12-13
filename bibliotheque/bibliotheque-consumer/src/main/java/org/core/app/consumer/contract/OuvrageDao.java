package org.core.app.consumer.contract;

import java.util.List;

import org.core.app.model.bean.Ouvrage;

public interface OuvrageDao {
	
	List<Ouvrage> listOuvrage();
	
	Ouvrage find(Integer id);
	
	void addOuvrage(Ouvrage ouvrage);
	
	void updateOuvrage(Ouvrage ouvrage);
	
	void deleteOuvrage(Ouvrage ouvrage);

}
