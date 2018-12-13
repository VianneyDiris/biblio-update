package com.vianney.ws.gestionrelance;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;
@WebService(name ="GestionRelance")
public interface GestionRelance {
	
	@WebMethod
	public List<Pret> getListPretNonRendu();
	
	@WebMethod
	public List<Pret> getListPretNonRenduByUser(@WebParam(name="utilisateur") Utilisateur user);

}
