package org.annexe.app.webapp.convert;

import com.vianney.ws.gestionpret.Utilisateur;

public class ConvertUser {
	
	public Utilisateur utilisateurToUtilisateurPret(com.vianney.ws.gestionuser.Utilisateur user) {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setId(user.getId());
		utilisateur.setNom(user.getNom());
		utilisateur.setPrenom(user.getPrenom());
		utilisateur.setMail(user.getMail());
		utilisateur.setPassword(user.getPassword());
				
		return utilisateur;
	}

	public com.vianney.ws.gestionreservation.Utilisateur utilisateurToUtilisateurReservation(com.vianney.ws.gestionuser.Utilisateur user){
		com.vianney.ws.gestionreservation.Utilisateur utilisateur = new com.vianney.ws.gestionreservation.Utilisateur();

		utilisateur.setId(user.getId());
		utilisateur.setNom(user.getNom());
		utilisateur.setPrenom(user.getPrenom());
		utilisateur.setMail(user.getMail());
		utilisateur.setPassword(user.getPassword());

		return utilisateur;
	}

}
