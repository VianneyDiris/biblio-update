package org.core.app.business.impl.manager;

import java.util.Date;
import java.util.List;

import org.core.app.business.contract.manager.PretManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PretManagerImpl extends AbstractManagerImpl implements PretManager {
	static final Log logger = LogFactory.getLog(PretManagerImpl.class);
	
	 private PlatformTransactionManager transactionManager;
	    
	 public void setTransactionManager(PlatformTransactionManager transactionManager) {
	        this.transactionManager = transactionManager;
	 }

	@Override
	public List<Pret> listPret() throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode listPret()");
		return getDaoFactory().getPretDao().listPret();
	}

	@Override
	public Pret find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode find(Integer id) avec id="+id);
		return getDaoFactory().getPretDao().find(id);
	}

	@Override
	public List<Pret> searchPretByUtilisateur(Utilisateur user) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode searchPretByUtilisateur(Utilisateur user)");
		return getDaoFactory().getPretDao().searchPretByUtilisateur(user);
	}

	@Override
	public List<Pret> searchPretByOuvrage(Ouvrage ouvrage) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode searchPretByOuvrage(Ouvrage ouvrage)");
		return getDaoFactory().getPretDao().searchPretByOuvrage(ouvrage);
	}

	@Override
	public void addPret(Pret pret) {
		// TODO Auto-generated method stub
		logger.info("méthode addPret(Pret pret)");
		
		 TransactionStatus vTransactionStatus = transactionManager.getTransaction(new DefaultTransactionDefinition());
		    try {
		    	getDaoFactory().getPretDao().addPret(pret);
		    } catch (Throwable vEx) {
		        transactionManager.rollback(vTransactionStatus);
		        logger.debug(vEx.getMessage());
		        throw vEx;
		    }
		  transactionManager.commit(vTransactionStatus);
	
		
	}

	@Override
	public void updatePret(Pret pret) {
		// TODO Auto-generated method stub
		logger.info("méthode updatePret(Pret pret)");
		getDaoFactory().getPretDao().updatePret(pret);
		
	}

	@Override
	public void deletePret(Pret pret) {
		// TODO Auto-generated method stub
		logger.info("méthode deletePret(Pret pret)");
		getDaoFactory().getPretDao().deletePret(pret);
	}

	@Override
	public List<Pret> listPretNonRendu(Date date) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getPretDao().listPretNonRendu(date);
	}

	@Override
	public List<Pret> listPretNonRenduByUser(Utilisateur user, Date date) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getPretDao().listPretNonRenduByUser(user,date);
	}

}
