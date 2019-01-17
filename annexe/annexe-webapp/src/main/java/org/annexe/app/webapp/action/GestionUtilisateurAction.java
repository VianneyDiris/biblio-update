package org.annexe.app.webapp.action;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.vianney.ws.gestionuser.GestionUser;
import com.vianney.ws.gestionuser.GestionUserService;
import com.vianney.ws.gestionuser.Utilisateur;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

@SuppressWarnings("serial")
public class GestionUtilisateurAction extends ActionSupport implements SessionAware {
	// ==================== Attributs ====================
	// ----- Paramètres en entrée
	private String nom;
	private String prenom;
	private String mail;
	private String password;
	private String passwordConfirm;
	private Map<String, Object> session;
	private String expiration;
	// ----- Paramètres en sortie
	private Utilisateur user;
	
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

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> pSession) {
		// TODO Auto-generated method stub
		this.session=pSession;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
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
				 user.setExpiration(true);
				 
				 boolean bool = serviceUser.addUtilisateur(user);
				 
				 if(bool) {
					 this.addActionMessage("Utilisateur ajouté");
				 }
				 vResult=ActionSupport.SUCCESS;
					
		 }
		return vResult;
	}

	public String doUserDetail(){
		user =(Utilisateur) session.get("user");


		return ActionSupport.SUCCESS;
	}

	public String doUpdateUser(){
		user =(Utilisateur) session.get("user");
		if (!StringUtils.isAllEmpty(nom)){
			user.setNom(nom);
		}
		if (!StringUtils.isAllEmpty(prenom)){
			user.setPrenom(prenom);
		}
		if (!StringUtils.isAllEmpty(mail)){
			user.setMail(mail);
		}
		if (!StringUtils.isAllEmpty(password)){
			user.setPassword(password);
		}

		user.setExpiration(Boolean.parseBoolean(expiration));

		GestionUserService userService = new GestionUserService();
		GestionUser serviceUser = userService.getGestionUserPort();

		serviceUser.updateUtilisateur(user);


		return ActionSupport.SUCCESS;
	}

}
