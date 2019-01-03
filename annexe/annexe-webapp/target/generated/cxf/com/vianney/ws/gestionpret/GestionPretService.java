package com.vianney.ws.gestionpret;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-01-03T16:18:18.381+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "GestionPretService", 
                  wsdlLocation = "file:/C:/Users/vianney/Documents/openclassrooms/projet/Améliorez%20le%20système%20d’information%20de%20la%20bibliothèque/biblio-update/annexe/annexe-webapp/src/main/resources/wsdl/gestionpret.wsdl",
                  targetNamespace = "http://gestionpret.ws.vianney.com/") 
public class GestionPretService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gestionpret.ws.vianney.com/", "GestionPretService");
    public final static QName GestionPretPort = new QName("http://gestionpret.ws.vianney.com/", "GestionPretPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/vianney/Documents/openclassrooms/projet/Améliorez%20le%20système%20d’information%20de%20la%20bibliothèque/biblio-update/annexe/annexe-webapp/src/main/resources/wsdl/gestionpret.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GestionPretService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/vianney/Documents/openclassrooms/projet/Améliorez%20le%20système%20d’information%20de%20la%20bibliothèque/biblio-update/annexe/annexe-webapp/src/main/resources/wsdl/gestionpret.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GestionPretService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GestionPretService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionPretService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public GestionPretService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GestionPretService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GestionPretService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns GestionPret
     */
    @WebEndpoint(name = "GestionPretPort")
    public GestionPret getGestionPretPort() {
        return super.getPort(GestionPretPort, GestionPret.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionPret
     */
    @WebEndpoint(name = "GestionPretPort")
    public GestionPret getGestionPretPort(WebServiceFeature... features) {
        return super.getPort(GestionPretPort, GestionPret.class, features);
    }

}
