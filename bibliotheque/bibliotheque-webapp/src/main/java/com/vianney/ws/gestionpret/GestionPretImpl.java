package com.vianney.ws.gestionpret;

import java.util.ArrayList;
import java.util.List;

import org.core.app.business.impl.ManagerFactoryImpl;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;

public class GestionPretImpl implements GestionPret {
	private ManagerFactoryImpl managerFactory;
	public ManagerFactoryImpl getManagerFactory() {
		return managerFactory;
	}
	public void setManagerFactory(ManagerFactoryImpl managerFactory) {
		this.managerFactory = managerFactory;
	}

	@Override
	public boolean addPret(Pret pret) {
		// TODO Auto-generated method stub
		System.out.println("DEBUG VDI - test Date server = "+pret);
		
		try {
			managerFactory.getPretManager().addPret(pret);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Pret> getListPretByUser(Utilisateur user) {
		// TODO Auto-generated method stub
		List<Pret> listPret = new ArrayList<Pret>();
		
		try {
			listPret=managerFactory.getPretManager().searchPretByUtilisateur(user);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listPret;
	}

	@Override
	public boolean updatePret(Pret pret) {
		// TODO Auto-generated method stub
		
		try {
			managerFactory.getPretManager().updatePret(pret);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	@Override
	public Pret getPretByID(Integer id) {
		// TODO Auto-generated method stub
		Pret pret = new Pret();
		
		try {
			pret=managerFactory.getPretManager().find(id);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pret;
	}

}
