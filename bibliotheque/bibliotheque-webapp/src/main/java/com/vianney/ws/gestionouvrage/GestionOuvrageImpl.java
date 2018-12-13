package com.vianney.ws.gestionouvrage;

import java.util.ArrayList;
import java.util.List;

import org.core.app.business.impl.ManagerFactoryImpl;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.exception.NotFoundException;

public class GestionOuvrageImpl implements GestionOuvrage {
private ManagerFactoryImpl managerFactory;
	
	public ManagerFactoryImpl getManagerFactory() {
		return managerFactory;
	}
	public void setManagerFactory(ManagerFactoryImpl managerFactory) {
		this.managerFactory = managerFactory;
	}

	@Override
	public Ouvrage getOuvrageByID(Integer id) {
		// TODO Auto-generated method stub
		Ouvrage ouvrage = new Ouvrage();
		
		try {
			ouvrage = managerFactory.getOuvrageManager().find(id);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ouvrage;
	}

	@Override
	public List<Ouvrage> getListOuvrage() {
		// TODO Auto-generated method stub
		List<Ouvrage> listOuvrage = new ArrayList<Ouvrage>();
		
		try {
			listOuvrage= managerFactory.getOuvrageManager().listOuvrage();
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listOuvrage;
	}

}
