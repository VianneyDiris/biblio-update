
package com.vianney.ws.gestionouvrage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vianney.ws.gestionouvrage package. 
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

    private final static QName _GetListOuvrage_QNAME = new QName("http://gestionouvrage.ws.vianney.com/", "getListOuvrage");
    private final static QName _GetListOuvrageResponse_QNAME = new QName("http://gestionouvrage.ws.vianney.com/", "getListOuvrageResponse");
    private final static QName _GetOuvrageByID_QNAME = new QName("http://gestionouvrage.ws.vianney.com/", "getOuvrageByID");
    private final static QName _GetOuvrageByIDResponse_QNAME = new QName("http://gestionouvrage.ws.vianney.com/", "getOuvrageByIDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vianney.ws.gestionouvrage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListOuvrage }
     * 
     */
    public GetListOuvrage createGetListOuvrage() {
        return new GetListOuvrage();
    }

    /**
     * Create an instance of {@link GetListOuvrageResponse }
     * 
     */
    public GetListOuvrageResponse createGetListOuvrageResponse() {
        return new GetListOuvrageResponse();
    }

    /**
     * Create an instance of {@link GetOuvrageByID }
     * 
     */
    public GetOuvrageByID createGetOuvrageByID() {
        return new GetOuvrageByID();
    }

    /**
     * Create an instance of {@link GetOuvrageByIDResponse }
     * 
     */
    public GetOuvrageByIDResponse createGetOuvrageByIDResponse() {
        return new GetOuvrageByIDResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOuvrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionouvrage.ws.vianney.com/", name = "getListOuvrage")
    public JAXBElement<GetListOuvrage> createGetListOuvrage(GetListOuvrage value) {
        return new JAXBElement<GetListOuvrage>(_GetListOuvrage_QNAME, GetListOuvrage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOuvrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionouvrage.ws.vianney.com/", name = "getListOuvrageResponse")
    public JAXBElement<GetListOuvrageResponse> createGetListOuvrageResponse(GetListOuvrageResponse value) {
        return new JAXBElement<GetListOuvrageResponse>(_GetListOuvrageResponse_QNAME, GetListOuvrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOuvrageByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionouvrage.ws.vianney.com/", name = "getOuvrageByID")
    public JAXBElement<GetOuvrageByID> createGetOuvrageByID(GetOuvrageByID value) {
        return new JAXBElement<GetOuvrageByID>(_GetOuvrageByID_QNAME, GetOuvrageByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOuvrageByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionouvrage.ws.vianney.com/", name = "getOuvrageByIDResponse")
    public JAXBElement<GetOuvrageByIDResponse> createGetOuvrageByIDResponse(GetOuvrageByIDResponse value) {
        return new JAXBElement<GetOuvrageByIDResponse>(_GetOuvrageByIDResponse_QNAME, GetOuvrageByIDResponse.class, null, value);
    }

}
