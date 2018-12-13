
package com.vianney.ws.gestionuser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vianney.ws.gestionuser package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddUtilisateur_QNAME = new QName("http://gestionuser.ws.vianney.com/", "addUtilisateur");
    private final static QName _AddUtilisateurResponse_QNAME = new QName("http://gestionuser.ws.vianney.com/", "addUtilisateurResponse");
    private final static QName _GetUtilisateur_QNAME = new QName("http://gestionuser.ws.vianney.com/", "getUtilisateur");
    private final static QName _GetUtilisateurResponse_QNAME = new QName("http://gestionuser.ws.vianney.com/", "getUtilisateurResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vianney.ws.gestionuser
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddUtilisateur }
     * 
     */
    public AddUtilisateur createAddUtilisateur() {
        return new AddUtilisateur();
    }

    /**
     * Create an instance of {@link AddUtilisateurResponse }
     * 
     */
    public AddUtilisateurResponse createAddUtilisateurResponse() {
        return new AddUtilisateurResponse();
    }

    /**
     * Create an instance of {@link GetUtilisateur }
     * 
     */
    public GetUtilisateur createGetUtilisateur() {
        return new GetUtilisateur();
    }

    /**
     * Create an instance of {@link GetUtilisateurResponse }
     * 
     */
    public GetUtilisateurResponse createGetUtilisateurResponse() {
        return new GetUtilisateurResponse();
    }

    /**
     * Create an instance of {@link Utilisateur }
     * 
     */
    public Utilisateur createUtilisateur() {
        return new Utilisateur();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionuser.ws.vianney.com/", name = "addUtilisateur")
    public JAXBElement<AddUtilisateur> createAddUtilisateur(AddUtilisateur value) {
        return new JAXBElement<AddUtilisateur>(_AddUtilisateur_QNAME, AddUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionuser.ws.vianney.com/", name = "addUtilisateurResponse")
    public JAXBElement<AddUtilisateurResponse> createAddUtilisateurResponse(AddUtilisateurResponse value) {
        return new JAXBElement<AddUtilisateurResponse>(_AddUtilisateurResponse_QNAME, AddUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionuser.ws.vianney.com/", name = "getUtilisateur")
    public JAXBElement<GetUtilisateur> createGetUtilisateur(GetUtilisateur value) {
        return new JAXBElement<GetUtilisateur>(_GetUtilisateur_QNAME, GetUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionuser.ws.vianney.com/", name = "getUtilisateurResponse")
    public JAXBElement<GetUtilisateurResponse> createGetUtilisateurResponse(GetUtilisateurResponse value) {
        return new JAXBElement<GetUtilisateurResponse>(_GetUtilisateurResponse_QNAME, GetUtilisateurResponse.class, null, value);
    }

}
