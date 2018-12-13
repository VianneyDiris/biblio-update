package org.core.app.consumer.contract;

import java.util.List;

import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;

public interface UtilisateurDao {
	
	List<Utilisateur> listUtilisateur();
	
	Utilisateur find(Integer id);
	
	Utilisateur search(String mail, String password);
	
	Utilisateur searchUserByPret(Pret pret);
	
	void addUtilisateur(Utilisateur user);
	
	void updateUtilisateur(Utilisateur user);
	
	void deleteUtilisateur(Utilisateur user);
	

}
