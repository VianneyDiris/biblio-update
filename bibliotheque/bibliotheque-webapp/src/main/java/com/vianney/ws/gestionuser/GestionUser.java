package com.vianney.ws.gestionuser;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.core.app.model.bean.Utilisateur;

@WebService(name ="GestionUser")
public interface GestionUser {
	
	@WebMethod
	public Utilisateur getUtilisateur(@WebParam(name="mail")String mail,@WebParam(name="password") String password);
	
	@WebMethod
	public boolean addUtilisateur(Utilisateur user);

}
