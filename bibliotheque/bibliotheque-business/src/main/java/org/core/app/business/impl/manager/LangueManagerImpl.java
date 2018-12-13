package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.LangueManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Langue;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.exception.NotFoundException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LangueManagerImpl extends AbstractManagerImpl implements LangueManager {
	static final Log logger = LogFactory.getLog(LangueManagerImpl.class);

	@Override
	public List<Langue> listLangue() throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode listLangue()");
		return getDaoFactory().getLangueDao().listLangue();
	}

	@Override
	public Langue find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode find(Integer id) avec id="+id);
		return getDaoFactory().getLangueDao().find(id);
	}

	@Override
	public Langue searchByOuvrage(Ouvrage ouvrage) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode searchByOuvrage(Ouvrage ouvrage)");
		return getDaoFactory().getLangueDao().searchByOuvrage(ouvrage);
	}

	@Override
	public void addLangue(Langue langue) {
		// TODO Auto-generated method stub
		logger.info("méthode addLangue(Langue langue)");
		getDaoFactory().getLangueDao().addLangue(langue);
		
	}

	@Override
	public void updateLangue(Langue langue) {
		// TODO Auto-generated method stub
		logger.info("méthode updateLangue(Langue langue)");
		getDaoFactory().getLangueDao().updateLangue(langue);
		
	}

	@Override
	public void deleteLangue(Langue langue) {
		// TODO Auto-generated method stub
		logger.info("méthode deleteLangue(Langue langue)");
		getDaoFactory().getLangueDao().deleteLangue(langue);
		
	}

}
