package com.vianney.ws.gestionouvrage;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.core.app.model.bean.Ouvrage;

@WebService(name ="GestionOuvrage")
public interface GestionOuvrage {
	
	@WebMethod
	public Ouvrage getOuvrageByID(@WebParam(name = "id")Integer id);
	
	@WebMethod
	public List<Ouvrage> getListOuvrage();

}
