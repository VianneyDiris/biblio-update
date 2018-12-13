package org.core.app.consumer.contract;

import java.util.List;

import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Status;

public interface StatusDao {
	
	List<Status> listStatus();
	
	Status find(Integer id);
	
	Status searchByPret(Pret pret);
	
	void addStatus(Status status);
	
	void updateStatus(Status status);
	
	void deleteStatus(Status status);
	
	

}
