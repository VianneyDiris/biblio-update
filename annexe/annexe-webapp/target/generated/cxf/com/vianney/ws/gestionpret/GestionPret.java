package com.vianney.ws.gestionpret;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-01-10T14:21:57.330+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://gestionpret.ws.vianney.com/", name = "GestionPret")
@XmlSeeAlso({ObjectFactory.class})
public interface GestionPret {

    @WebMethod
    @RequestWrapper(localName = "getPretByID", targetNamespace = "http://gestionpret.ws.vianney.com/", className = "com.vianney.ws.gestionpret.GetPretByID")
    @ResponseWrapper(localName = "getPretByIDResponse", targetNamespace = "http://gestionpret.ws.vianney.com/", className = "com.vianney.ws.gestionpret.GetPretByIDResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.vianney.ws.gestionpret.Pret getPretByID(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.Integer id
    );

    @WebMethod
    @RequestWrapper(localName = "updatePret", targetNamespace = "http://gestionpret.ws.vianney.com/", className = "com.vianney.ws.gestionpret.UpdatePret")
    @ResponseWrapper(localName = "updatePretResponse", targetNamespace = "http://gestionpret.ws.vianney.com/", className = "com.vianney.ws.gestionpret.UpdatePretResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean updatePret(
        @WebParam(name = "pret", targetNamespace = "")
        com.vianney.ws.gestionpret.Pret pret
    );

    @WebMethod
    @RequestWrapper(localName = "getListPretByUser", targetNamespace = "http://gestionpret.ws.vianney.com/", className = "com.vianney.ws.gestionpret.GetListPretByUser")
    @ResponseWrapper(localName = "getListPretByUserResponse", targetNamespace = "http://gestionpret.ws.vianney.com/", className = "com.vianney.ws.gestionpret.GetListPretByUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.vianney.ws.gestionpret.Pret> getListPretByUser(
        @WebParam(name = "utilisateur", targetNamespace = "")
        com.vianney.ws.gestionpret.Utilisateur utilisateur
    );

    @WebMethod
    @RequestWrapper(localName = "addPret", targetNamespace = "http://gestionpret.ws.vianney.com/", className = "com.vianney.ws.gestionpret.AddPret")
    @ResponseWrapper(localName = "addPretResponse", targetNamespace = "http://gestionpret.ws.vianney.com/", className = "com.vianney.ws.gestionpret.AddPretResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean addPret(
        @WebParam(name = "pret", targetNamespace = "")
        com.vianney.ws.gestionpret.Pret pret
    );

    @WebMethod
    @RequestWrapper(localName = "getListPretByOuvrage", targetNamespace = "http://gestionpret.ws.vianney.com/", className = "com.vianney.ws.gestionpret.GetListPretByOuvrage")
    @ResponseWrapper(localName = "getListPretByOuvrageResponse", targetNamespace = "http://gestionpret.ws.vianney.com/", className = "com.vianney.ws.gestionpret.GetListPretByOuvrageResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.vianney.ws.gestionpret.Pret> getListPretByOuvrage(
        @WebParam(name = "ouvrage", targetNamespace = "")
        com.vianney.ws.gestionpret.Ouvrage ouvrage
    );
}
