package org.core.app.business.contract.manager;

import java.util.List;

import org.core.app.model.bean.Langue;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.exception.NotFoundException;

public interface LangueManager {
	
	List<Langue> listLangue()throws NotFoundException;
	
	Langue find(Integer id)throws NotFoundException;
	
	Langue searchByOuvrage(Ouvrage ouvrage)throws NotFoundException;
	
	void addLangue(Langue langue);
	
	void updateLangue(Langue langue);
	
	void deleteLangue(Langue langue);

}
