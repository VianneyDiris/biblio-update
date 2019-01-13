package com.vianney.ws.gestionouvrage;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-01-13T14:38:51.674+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "GestionOuvrageService", 
                  wsdlLocation = "file:/C:/Users/vianney/Documents/openclassrooms/projet/Améliorez%20le%20système%20d’information%20de%20la%20bibliothèque/biblio-update/annexe/annexe-webapp/src/main/resources/wsdl/gestionouvrage.wsdl",
                  targetNamespace = "http://gestionouvrage.ws.vianney.com/") 
public class GestionOuvrageService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gestionouvrage.ws.vianney.com/", "GestionOuvrageService");
    public final static QName GestionOuvragePort = new QName("http://gestionouvrage.ws.vianney.com/", "GestionOuvragePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/vianney/Documents/openclassrooms/projet/Améliorez%20le%20système%20d’information%20de%20la%20bibliothèque/biblio-update/annexe/annexe-webapp/src/main/resources/wsdl/gestionouvrage.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GestionOuvrageService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/vianney/Documents/openclassrooms/projet/Améliorez%20le%20système%20d’information%20de%20la%20bibliothèque/biblio-update/annexe/annexe-webapp/src/main/resources/wsdl/gestionouvrage.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GestionOuvrageService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GestionOuvrageService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionOuvrageService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public GestionOuvrageService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GestionOuvrageService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GestionOuvrageService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns GestionOuvrage
     */
    @WebEndpoint(name = "GestionOuvragePort")
    public GestionOuvrage getGestionOuvragePort() {
        return super.getPort(GestionOuvragePort, GestionOuvrage.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionOuvrage
     */
    @WebEndpoint(name = "GestionOuvragePort")
    public GestionOuvrage getGestionOuvragePort(WebServiceFeature... features) {
        return super.getPort(GestionOuvragePort, GestionOuvrage.class, features);
    }

}
