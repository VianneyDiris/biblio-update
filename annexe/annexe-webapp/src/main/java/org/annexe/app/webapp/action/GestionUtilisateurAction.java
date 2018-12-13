package org.annexe.app.webapp.action;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.vianney.ws.gestionuser.GestionUser;
import com.vianney.ws.gestionuser.GestionUserService;
import com.vianney.ws.gestionuser.Utilisateur;

@SuppressWarnings("serial")
public class GestionUtilisateurAction extends ActionSupport {
	// ==================== Attributs ====================
	// ----- Paramètres en entrée
	private String nom;
	private String prenom;
	private String mail;
	private String password;
	private String passwordConfirm;
	
	// ==================== Getters/Setters ====================
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}	
	
	// ==================== Méthodes ====================
	public String doCreateUser() {
		
		String vResult = ActionSupport.INPUT;
		 if (!StringUtils.isAllEmpty(nom,prenom,mail,password,passwordConfirm)) {
	        	if(!password.equals(passwordConfirm)) {
	        		this.addFieldError("password", "mot de passe différent");
	        	}
	        	 GestionUserService userService = new GestionUserService();		
				 GestionUser serviceUser = userService.getGestionUserPort();
				 Utilisateur user = new Utilisateur();
				 user.setId(0);
				 user.setNom(nom);
				 user.setPrenom(prenom);
				 user.setMail(mail);
				 user.setPassword(password);
				 
				 boolean bool = serviceUser.addUtilisateur(user);
				 
				 if(bool) {
					 this.addActionMessage("Utilisateur ajouté");
				 }
				 vResult=ActionSupport.SUCCESS;
					
		 }
		return vResult;
	}

}
