package org.core.app.business.contract.manager;

import java.util.List;

import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;

public interface UtilisateurManager {
	
	List<Utilisateur> listUtilisateur()throws NotFoundException;
	
	Utilisateur find(Integer id)throws NotFoundException;
	
	Utilisateur search(String mail, String password)throws NotFoundException;
	
	Utilisateur searchUserByPret(Pret pret)throws NotFoundException;
	
	void addUtilisateur(Utilisateur user);
	
	void updateUtilisateur(Utilisateur user);
	
	void deleteUtilisateur(Utilisateur user);

}
