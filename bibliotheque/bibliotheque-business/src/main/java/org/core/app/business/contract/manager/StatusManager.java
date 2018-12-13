package org.core.app.business.contract.manager;

import java.util.List;

import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Status;
import org.core.app.model.exception.NotFoundException;

public interface StatusManager {
	
	List<Status> listStatus()throws NotFoundException;
	
	Status find(Integer id)throws NotFoundException;
	
	Status searchByPret(Pret pret)throws NotFoundException;
	
	void addStatus(Status status);
	
	void updateStatus(Status status);
	
	void deleteStatus(Status status);

}
