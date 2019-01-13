package com.vianney.ws.gestionuser;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-01-13T17:48:21.875+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://gestionuser.ws.vianney.com/", name = "GestionUser")
@XmlSeeAlso({ObjectFactory.class})
public interface GestionUser {

    @WebMethod
    @RequestWrapper(localName = "addUtilisateur", targetNamespace = "http://gestionuser.ws.vianney.com/", className = "com.vianney.ws.gestionuser.AddUtilisateur")
    @ResponseWrapper(localName = "addUtilisateurResponse", targetNamespace = "http://gestionuser.ws.vianney.com/", className = "com.vianney.ws.gestionuser.AddUtilisateurResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean addUtilisateur(
        @WebParam(name = "arg0", targetNamespace = "")
        com.vianney.ws.gestionuser.Utilisateur arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getUtilisateur", targetNamespace = "http://gestionuser.ws.vianney.com/", className = "com.vianney.ws.gestionuser.GetUtilisateur")
    @ResponseWrapper(localName = "getUtilisateurResponse", targetNamespace = "http://gestionuser.ws.vianney.com/", className = "com.vianney.ws.gestionuser.GetUtilisateurResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.vianney.ws.gestionuser.Utilisateur getUtilisateur(
        @WebParam(name = "mail", targetNamespace = "")
        java.lang.String mail,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );
}
