package org.annexe.app.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import com.vianney.ws.gestionuser.GestionUser;
import com.vianney.ws.gestionuser.GestionUserService;
import com.vianney.ws.gestionuser.Utilisateur;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements ServletRequestAware,SessionAware{
	static final Log logger = LogFactory.getLog(LoginAction.class);
	
	// ==================== Attributs ====================
    // ----- Paramètres en entrée
    private String mail;
    private String password;
    
    // ----- Paramètres en sortie
    private Map<String, Object> session;
    private HttpServletRequest servletRequest;
	
    // ==================== Getters/Setters ====================
    public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setSession(Map<String, Object> pSession) {
		// TODO Auto-generated method stub
		this.session=pSession;
		
	}
	@Override
	public void setServletRequest(HttpServletRequest pRequest) {
	    this.servletRequest = pRequest;
	}
	
	// ==================== Méthodes ====================
	public String execute(){
		logger.debug("méthode execute");
		
		
		return ActionSupport.SUCCESS;
	}
	
	public String doLogin() {
		String vResult = ActionSupport.INPUT;
		
		 if (!StringUtils.isAllEmpty(mail, password)) {
		
			 GestionUserService userService = new GestionUserService();		
			 GestionUser serviceUser = userService.getGestionUserPort();
			 Utilisateur user = new Utilisateur();
		
			try {
				user = serviceUser.getUtilisateur(mail, password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				logger.info(e.getMessage());
				this.addActionError("Identifiant ou mot de passe invalide !");
			}
			this.session.put("user", user);
			vResult=ActionSupport.SUCCESS;
			
			 }
		return vResult;
	}
	
	 public String doLogout() {
	    	logger.debug("LoginAction méthode doLogout()");
	    	
	    	this.session.remove("user");
	    	// Invalidation de la session
	        this.servletRequest.getSession().invalidate();
	    	
	        return ActionSupport.SUCCESS;
	    }
	
}
