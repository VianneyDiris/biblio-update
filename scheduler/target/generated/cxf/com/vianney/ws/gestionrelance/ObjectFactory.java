
package com.vianney.ws.gestionrelance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vianney.ws.gestionrelance package. 
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

    private final static QName _GetListPretNonRendu_QNAME = new QName("http://gestionrelance.ws.vianney.com/", "getListPretNonRendu");
    private final static QName _GetListPretNonRenduByUser_QNAME = new QName("http://gestionrelance.ws.vianney.com/", "getListPretNonRenduByUser");
    private final static QName _GetListPretNonRenduByUserResponse_QNAME = new QName("http://gestionrelance.ws.vianney.com/", "getListPretNonRenduByUserResponse");
    private final static QName _GetListPretNonRenduResponse_QNAME = new QName("http://gestionrelance.ws.vianney.com/", "getListPretNonRenduResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vianney.ws.gestionrelance
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListPretNonRendu }
     * 
     */
    public GetListPretNonRendu createGetListPretNonRendu() {
        return new GetListPretNonRendu();
    }

    /**
     * Create an instance of {@link GetListPretNonRenduByUser }
     * 
     */
    public GetListPretNonRenduByUser createGetListPretNonRenduByUser() {
        return new GetListPretNonRenduByUser();
    }

    /**
     * Create an instance of {@link GetListPretNonRenduByUserResponse }
     * 
     */
    public GetListPretNonRenduByUserResponse createGetListPretNonRenduByUserResponse() {
        return new GetListPretNonRenduByUserResponse();
    }

    /**
     * Create an instance of {@link GetListPretNonRenduResponse }
     * 
     */
    public GetListPretNonRenduResponse createGetListPretNonRenduResponse() {
        return new GetListPretNonRenduResponse();
    }

    /**
     * Create an instance of {@link Pret }
     * 
     */
    public Pret createPret() {
        return new Pret();
    }

    /**
     * Create an instance of {@link Ouvrage }
     * 
     */
    public Ouvrage createOuvrage() {
        return new Ouvrage();
    }

    /**
     * Create an instance of {@link Editeur }
     * 
     */
    public Editeur createEditeur() {
        return new Editeur();
    }

    /**
     * Create an instance of {@link Langue }
     * 
     */
    public Langue createLangue() {
        return new Langue();
    }

    /**
     * Create an instance of {@link Auteur }
     * 
     */
    public Auteur createAuteur() {
        return new Auteur();
    }

    /**
     * Create an instance of {@link Genre }
     * 
     */
    public Genre createGenre() {
        return new Genre();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link Utilisateur }
     * 
     */
    public Utilisateur createUtilisateur() {
        return new Utilisateur();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPretNonRendu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionrelance.ws.vianney.com/", name = "getListPretNonRendu")
    public JAXBElement<GetListPretNonRendu> createGetListPretNonRendu(GetListPretNonRendu value) {
        return new JAXBElement<GetListPretNonRendu>(_GetListPretNonRendu_QNAME, GetListPretNonRendu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPretNonRenduByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionrelance.ws.vianney.com/", name = "getListPretNonRenduByUser")
    public JAXBElement<GetListPretNonRenduByUser> createGetListPretNonRenduByUser(GetListPretNonRenduByUser value) {
        return new JAXBElement<GetListPretNonRenduByUser>(_GetListPretNonRenduByUser_QNAME, GetListPretNonRenduByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPretNonRenduByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionrelance.ws.vianney.com/", name = "getListPretNonRenduByUserResponse")
    public JAXBElement<GetListPretNonRenduByUserResponse> createGetListPretNonRenduByUserResponse(GetListPretNonRenduByUserResponse value) {
        return new JAXBElement<GetListPretNonRenduByUserResponse>(_GetListPretNonRenduByUserResponse_QNAME, GetListPretNonRenduByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPretNonRenduResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionrelance.ws.vianney.com/", name = "getListPretNonRenduResponse")
    public JAXBElement<GetListPretNonRenduResponse> createGetListPretNonRenduResponse(GetListPretNonRenduResponse value) {
        return new JAXBElement<GetListPretNonRenduResponse>(_GetListPretNonRenduResponse_QNAME, GetListPretNonRenduResponse.class, null, value);
    }

}
