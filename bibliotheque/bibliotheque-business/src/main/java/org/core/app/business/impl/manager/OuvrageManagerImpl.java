package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.OuvrageManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.exception.NotFoundException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class OuvrageManagerImpl extends AbstractManagerImpl implements OuvrageManager {
	static final Log logger = LogFactory.getLog(OuvrageManagerImpl.class);

	@Override
	public List<Ouvrage> listOuvrage() throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode listOuvrage()");
		return getDaoFactory().getOuvrageDao().listOuvrage();
	}

	@Override
	public Ouvrage find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode find(Integer id) avec id="+id);
		return getDaoFactory().getOuvrageDao().find(id);
	}

	@Override
	public void addOuvrage(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		logger.info("méthode addOuvrage(Ouvrage ouvrage)");
		getDaoFactory().getOuvrageDao().addOuvrage(ouvrage);
		
	}

	@Override
	public void updateOuvrage(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		logger.info("méthode updateOuvrage(Ouvrage ouvrage)");
		getDaoFactory().getOuvrageDao().updateOuvrage(ouvrage);
		
	}

	@Override
	public void deleteOuvrage(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		logger.info("méthode deleteOuvrage(Ouvrage ouvrage)");
		getDaoFactory().getOuvrageDao().deleteOuvrage(ouvrage);
		
	}

}
