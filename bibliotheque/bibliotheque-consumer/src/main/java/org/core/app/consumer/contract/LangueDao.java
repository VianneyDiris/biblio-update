package org.core.app.consumer.contract;

import java.util.List;

import org.core.app.model.bean.Langue;
import org.core.app.model.bean.Ouvrage;

public interface LangueDao {
	
	List<Langue> listLangue();
	
	Langue find(Integer id);
	
	Langue searchByOuvrage(Ouvrage ouvrage);
	
	void addLangue(Langue langue);
	
	void updateLangue(Langue langue);
	
	void deleteLangue(Langue langue);
	
	

}
