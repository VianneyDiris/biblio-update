
package com.vianney.ws.gestionpret;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vianney.ws.gestionpret package. 
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

    private final static QName _AddPret_QNAME = new QName("http://gestionpret.ws.vianney.com/", "addPret");
    private final static QName _AddPretResponse_QNAME = new QName("http://gestionpret.ws.vianney.com/", "addPretResponse");
    private final static QName _GetListPretByUser_QNAME = new QName("http://gestionpret.ws.vianney.com/", "getListPretByUser");
    private final static QName _GetListPretByUserResponse_QNAME = new QName("http://gestionpret.ws.vianney.com/", "getListPretByUserResponse");
    private final static QName _GetPretByID_QNAME = new QName("http://gestionpret.ws.vianney.com/", "getPretByID");
    private final static QName _GetPretByIDResponse_QNAME = new QName("http://gestionpret.ws.vianney.com/", "getPretByIDResponse");
    private final static QName _UpdatePret_QNAME = new QName("http://gestionpret.ws.vianney.com/", "updatePret");
    private final static QName _UpdatePretResponse_QNAME = new QName("http://gestionpret.ws.vianney.com/", "updatePretResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vianney.ws.gestionpret
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPret }
     * 
     */
    public AddPret createAddPret() {
        return new AddPret();
    }

    /**
     * Create an instance of {@link AddPretResponse }
     * 
     */
    public AddPretResponse createAddPretResponse() {
        return new AddPretResponse();
    }

    /**
     * Create an instance of {@link GetListPretByUser }
     * 
     */
    public GetListPretByUser createGetListPretByUser() {
        return new GetListPretByUser();
    }

    /**
     * Create an instance of {@link GetListPretByUserResponse }
     * 
     */
    public GetListPretByUserResponse createGetListPretByUserResponse() {
        return new GetListPretByUserResponse();
    }

    /**
     * Create an instance of {@link GetPretByID }
     * 
     */
    public GetPretByID createGetPretByID() {
        return new GetPretByID();
    }

    /**
     * Create an instance of {@link GetPretByIDResponse }
     * 
     */
    public GetPretByIDResponse createGetPretByIDResponse() {
        return new GetPretByIDResponse();
    }

    /**
     * Create an instance of {@link UpdatePret }
     * 
     */
    public UpdatePret createUpdatePret() {
        return new UpdatePret();
    }

    /**
     * Create an instance of {@link UpdatePretResponse }
     * 
     */
    public UpdatePretResponse createUpdatePretResponse() {
        return new UpdatePretResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionpret.ws.vianney.com/", name = "addPret")
    public JAXBElement<AddPret> createAddPret(AddPret value) {
        return new JAXBElement<AddPret>(_AddPret_QNAME, AddPret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionpret.ws.vianney.com/", name = "addPretResponse")
    public JAXBElement<AddPretResponse> createAddPretResponse(AddPretResponse value) {
        return new JAXBElement<AddPretResponse>(_AddPretResponse_QNAME, AddPretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPretByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionpret.ws.vianney.com/", name = "getListPretByUser")
    public JAXBElement<GetListPretByUser> createGetListPretByUser(GetListPretByUser value) {
        return new JAXBElement<GetListPretByUser>(_GetListPretByUser_QNAME, GetListPretByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPretByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionpret.ws.vianney.com/", name = "getListPretByUserResponse")
    public JAXBElement<GetListPretByUserResponse> createGetListPretByUserResponse(GetListPretByUserResponse value) {
        return new JAXBElement<GetListPretByUserResponse>(_GetListPretByUserResponse_QNAME, GetListPretByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPretByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionpret.ws.vianney.com/", name = "getPretByID")
    public JAXBElement<GetPretByID> createGetPretByID(GetPretByID value) {
        return new JAXBElement<GetPretByID>(_GetPretByID_QNAME, GetPretByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPretByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionpret.ws.vianney.com/", name = "getPretByIDResponse")
    public JAXBElement<GetPretByIDResponse> createGetPretByIDResponse(GetPretByIDResponse value) {
        return new JAXBElement<GetPretByIDResponse>(_GetPretByIDResponse_QNAME, GetPretByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionpret.ws.vianney.com/", name = "updatePret")
    public JAXBElement<UpdatePret> createUpdatePret(UpdatePret value) {
        return new JAXBElement<UpdatePret>(_UpdatePret_QNAME, UpdatePret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionpret.ws.vianney.com/", name = "updatePretResponse")
    public JAXBElement<UpdatePretResponse> createUpdatePretResponse(UpdatePretResponse value) {
        return new JAXBElement<UpdatePretResponse>(_UpdatePretResponse_QNAME, UpdatePretResponse.class, null, value);
    }

}
