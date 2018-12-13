package com.vianney.ws.gestionpret;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;

@WebService(name ="GestionPret")
public interface GestionPret {
	
	@WebMethod
	public boolean addPret(@WebParam(name="pret")Pret pret);
	
	@WebMethod
	public List<Pret> getListPretByUser(@WebParam(name="utilisateur")Utilisateur user);
	
	@WebMethod
	public boolean updatePret(@WebParam(name="pret")Pret pret);
	
	@WebMethod
	public Pret getPretByID(@WebParam(name = "id")Integer id);

}
