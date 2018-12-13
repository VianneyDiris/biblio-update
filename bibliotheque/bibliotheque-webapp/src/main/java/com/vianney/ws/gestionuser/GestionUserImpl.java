package com.vianney.ws.gestionuser;

import org.core.app.business.impl.ManagerFactoryImpl;
import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;

public class GestionUserImpl implements GestionUser {
	private ManagerFactoryImpl managerFactory;
	public ManagerFactoryImpl getManagerFactory() {
		return managerFactory;
	}
	public void setManagerFactory(ManagerFactoryImpl managerFactory) {
		this.managerFactory = managerFactory;
	}

	@Override
	public Utilisateur getUtilisateur(String mail, String password) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = new Utilisateur();
		try {
			utilisateur = managerFactory.getUtilisateurManager().search(mail, password);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return utilisateur;
	}

	@Override
	public boolean addUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		managerFactory.getUtilisateurManager().addUtilisateur(user);
		return true;
	}

}
