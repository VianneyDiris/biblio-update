package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.AuteurManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Auteur;
import org.core.app.model.exception.NotFoundException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AuteurManagerImpl extends AbstractManagerImpl implements AuteurManager {
	static final Log logger = LogFactory.getLog(AuteurManagerImpl.class);

	@Override
	public List<Auteur> listAuteur() throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode listAuteur()");
		return getDaoFactory().getAuteurDao().listAuteur() ;
	}

	@Override
	public Auteur find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode find(Integer id) avec id="+id);
		return getDaoFactory().getAuteurDao().find(id);
	}

	@Override
	public List<Auteur> searchAuteurByOuvrageId(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode searchAuteurByOuvrageId(Integer id) avec id="+id);
		return getDaoFactory().getAuteurDao().searchAuteurByOuvrageId(id);
	}

	@Override
	public void addAuteur(Auteur auteur) {
		// TODO Auto-generated method stub
		logger.info("méthode addAuteur()");
		getDaoFactory().getAuteurDao().addAuteur(auteur);
		
	}

	@Override
	public void updateAuteur(Auteur auteur) {
		// TODO Auto-generated method stub
		logger.info("méthode updateAuteur()");
		getDaoFactory().getAuteurDao().updateAuteur(auteur);
		
	}

	@Override
	public void deleteAuteur(Auteur auteur) {
		// TODO Auto-generated method stub
		logger.info("méthode deleteAuteur()");
		getDaoFactory().getAuteurDao().deleteAuteur(auteur);
		
	}

}
