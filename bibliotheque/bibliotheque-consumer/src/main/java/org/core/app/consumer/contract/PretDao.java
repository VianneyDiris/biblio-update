package org.core.app.consumer.contract;

import java.util.Date;
import java.util.List;

import org.core.app.model.bean.Ouvrage;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;

public interface PretDao {
	
	List<Pret> listPret();
	
	Pret find(Integer id);
	
	List<Pret> searchPretByUtilisateur(Utilisateur user);
	
	List<Pret> searchPretByOuvrage(Ouvrage ouvrage);
	
	List<Pret> listPretNonRendu(Date date);
	
	List<Pret> listPretNonRenduByUser(Utilisateur user, Date date);
	
	void addPret(Pret pret);
	
	void updatePret(Pret pret);
	
	void deletePret(Pret pret);

}
