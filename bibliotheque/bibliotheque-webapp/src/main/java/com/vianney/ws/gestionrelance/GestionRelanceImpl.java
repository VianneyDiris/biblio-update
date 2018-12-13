package com.vianney.ws.gestionrelance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.core.app.business.impl.ManagerFactoryImpl;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;

public class GestionRelanceImpl implements GestionRelance {
	private ManagerFactoryImpl managerFactory;
	public ManagerFactoryImpl getManagerFactory() {
		return managerFactory;
	}
	public void setManagerFactory(ManagerFactoryImpl managerFactory) {
		this.managerFactory = managerFactory;
	}

	@Override
	public List<Pret> getListPretNonRendu() {
		// TODO Auto-generated method stub
		Date date = new Date();
		List<Pret> listNonRendu = new ArrayList<Pret>();
				
		try {
			listNonRendu=managerFactory.getPretManager().listPretNonRendu(date);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listNonRendu;
	}
	@Override
	public List<Pret> getListPretNonRenduByUser(Utilisateur user) {
		// TODO Auto-generated method stub
		Date date = new Date();
		List<Pret> listNonRendu = new ArrayList<Pret>();
		
		try {
			listNonRendu=managerFactory.getPretManager().listPretNonRenduByUser(user,date);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listNonRendu;
	}

}
