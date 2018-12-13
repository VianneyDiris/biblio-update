package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.StatusManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Status;
import org.core.app.model.exception.NotFoundException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class StatusManagerImpl extends AbstractManagerImpl implements StatusManager {
	static final Log logger = LogFactory.getLog(StatusManagerImpl.class);

	@Override
	public List<Status> listStatus() throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode listStatus()");
		return getDaoFactory().getStatusDao().listStatus();
	}

	@Override
	public Status find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode find(Integer id) avec id="+id);
		return getDaoFactory().getStatusDao().find(id);
	}

	@Override
	public Status searchByPret(Pret pret) throws NotFoundException {
		// TODO Auto-generated method stub
		logger.info("méthode searchByPret(Pret pret)");
		return getDaoFactory().getStatusDao().searchByPret(pret);
	}

	@Override
	public void addStatus(Status status) {
		// TODO Auto-generated method stub
		logger.info("méthode addStatus(Status status)");
		getDaoFactory().getStatusDao().addStatus(status);
		
	}

	@Override
	public void updateStatus(Status status) {
		// TODO Auto-generated method stub
		logger.info("méthode updateStatus(Status status)");
		getDaoFactory().getStatusDao().updateStatus(status);
		
	}

	@Override
	public void deleteStatus(Status status) {
		// TODO Auto-generated method stub
		logger.info("méthode deleteStatus(Status status)");
		getDaoFactory().getStatusDao().deleteStatus(status);
		
	}

}
