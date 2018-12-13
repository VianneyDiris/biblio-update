package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.UtilisateurManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UtilisateurManagerImpl extends AbstractManagerImpl implements UtilisateurManager {
	static final Log logger = LogFactory.getLog(UtilisateurManagerImpl.class);

	@Override
	public List<Utilisateur> listUtilisateur() throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode listUtilisateur()");
		return getDaoFactory().getUtilisateurDao().listUtilisateur();
	}

	@Override
	public Utilisateur find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode find(Integer id) avec id="+id);
		return getDaoFactory().getUtilisateurDao().find(id);
	}

	@Override
	public Utilisateur search(String mail, String password) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode search(String mail, String password) avec mail="+mail+" password="+password);
		return getDaoFactory().getUtilisateurDao().search(mail, password);
	}

	@Override
	public Utilisateur searchUserByPret(Pret pret) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode searchUserByPret(Pret pret)");
		return getDaoFactory().getUtilisateurDao().searchUserByPret(pret);
	}

	@Override
	public void addUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		logger.info("méthode addUtilisateur(Utilisateur user)");
		getDaoFactory().getUtilisateurDao().addUtilisateur(user);
	}

	@Override
	public void updateUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		logger.info("méthode updateUtilisateur(Utilisateur user)");
		getDaoFactory().getUtilisateurDao().updateUtilisateur(user);
		
	}

	@Override
	public void deleteUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		logger.info("méthode deleteUtilisateur(Utilisateur user)");
		getDaoFactory().getUtilisateurDao().deleteUtilisateur(user);
		
	}

}
