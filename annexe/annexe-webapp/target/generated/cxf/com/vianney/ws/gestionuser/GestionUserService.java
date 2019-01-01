package com.vianney.ws.gestionuser;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-01-01T16:24:27.239+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "GestionUserService", 
                  wsdlLocation = "file:/C:/Users/vianney/Documents/openclassrooms/projet/Améliorez%20le%20système%20d’information%20de%20la%20bibliothèque/biblio-update/annexe/annexe-webapp/src/main/resources/wsdl/gestionuser.wsdl",
                  targetNamespace = "http://gestionuser.ws.vianney.com/") 
public class GestionUserService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gestionuser.ws.vianney.com/", "GestionUserService");
    public final static QName GestionUserPort = new QName("http://gestionuser.ws.vianney.com/", "GestionUserPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/vianney/Documents/openclassrooms/projet/Améliorez%20le%20système%20d’information%20de%20la%20bibliothèque/biblio-update/annexe/annexe-webapp/src/main/resources/wsdl/gestionuser.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GestionUserService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/vianney/Documents/openclassrooms/projet/Améliorez%20le%20système%20d’information%20de%20la%20bibliothèque/biblio-update/annexe/annexe-webapp/src/main/resources/wsdl/gestionuser.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GestionUserService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GestionUserService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionUserService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public GestionUserService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GestionUserService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GestionUserService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns GestionUser
     */
    @WebEndpoint(name = "GestionUserPort")
    public GestionUser getGestionUserPort() {
        return super.getPort(GestionUserPort, GestionUser.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionUser
     */
    @WebEndpoint(name = "GestionUserPort")
    public GestionUser getGestionUserPort(WebServiceFeature... features) {
        return super.getPort(GestionUserPort, GestionUser.class, features);
    }

}
