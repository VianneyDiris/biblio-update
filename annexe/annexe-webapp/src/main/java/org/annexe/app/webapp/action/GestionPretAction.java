package org.annexe.app.webapp.action;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.annexe.app.webapp.convert.ConvertOuvrage;
import org.annexe.app.webapp.convert.ConvertUser;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.vianney.ws.gestionouvrage.GestionOuvrage;
import com.vianney.ws.gestionouvrage.GestionOuvrageService;
import com.vianney.ws.gestionpret.GestionPret;
import com.vianney.ws.gestionpret.GestionPretService;
import com.vianney.ws.gestionpret.Ouvrage;
import com.vianney.ws.gestionpret.Pret;
import com.vianney.ws.gestionpret.Status;
import com.vianney.ws.gestionpret.Utilisateur;

@SuppressWarnings("serial")
@Component
public class GestionPretAction extends ActionSupport implements SessionAware{
	// ==================== Attributs ====================
	// ----- Paramètres en entrée
	private Utilisateur user;
	private Ouvrage ouvrage;
	private Map<String, Object> session;
	private Integer id;
	
	@Value("${duree.prolongation}")
	private int prolongationPret;
	
	@Value("${duree.emprunt}")
	private int dureePret;
	
	// ----- Paramètres en sortie
	private Pret pret;
	private List<Pret> listPret;
	private Date dateReservation;
	private Date dateFinReservation;

	// ==================== Getters/Setters ====================
	public Utilisateur getUser() {
		return user;
	}
	public void setUser(Utilisateur user) {
		this.user = user;
	}
	public Ouvrage getOuvrage() {
		return ouvrage;
	}
	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}
	public Pret getPret() {
		return pret;
	}
	public void setPret(Pret pret) {
		this.pret = pret;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> pSession) {
		// TODO Auto-generated method stub	
		this.session=pSession;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Pret> getListPret() {
		return listPret;
	}
	public void setListPret(List<Pret> listPret) {
		this.listPret = listPret;
	}
	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public Date getDateFinReservation() {
		return dateFinReservation;
	}

	public void setDateFinReservation(Date dateFinReservation) {
		this.dateFinReservation = dateFinReservation;
	}
	public int getProlongationPret() {
		return prolongationPret;
	}

	public void setProlongationPret(int prolongationPret) {
		this.prolongationPret = prolongationPret;
	}

	public int getDureePret() {
		return dureePret;
	}

	public void setDureePret(int dureePret) {
		this.dureePret = dureePret;
	}

	// ==================== Méthodes ====================
	public String doAddPret() {
		ConvertUser userConvert = new ConvertUser();
		com.vianney.ws.gestionuser.Utilisateur utilisateur = new com.vianney.ws.gestionuser.Utilisateur();
		utilisateur=(com.vianney.ws.gestionuser.Utilisateur) session.get("user");
		user = userConvert.utilisateurToUtilisateurPret(utilisateur);		
		
		GestionOuvrageService serviceOuvrage = new GestionOuvrageService();
		GestionOuvrage ouvrageService = serviceOuvrage.getGestionOuvragePort();
		
		ConvertOuvrage convert = new ConvertOuvrage();
		ouvrage = convert.ouvrageToOuvragePret(ouvrageService.getOuvrageByID(id));
		
		Status status = new Status();
		status.setId(1);
		status.setStatus("en cours");
		
		LocalDateTime currentTime = LocalDateTime.now();
		LocalDateTime currentTime2 = LocalDateTime.now();
		currentTime2=currentTime.plus(dureePret, ChronoUnit.WEEKS);
		
		LocalDate date = currentTime.toLocalDate();
		GregorianCalendar gcal = GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));
		XMLGregorianCalendar dateDebut = null;
		try {
			dateDebut = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		LocalDate date2 = currentTime2.toLocalDate();
		GregorianCalendar gcal2 = GregorianCalendar.from(date2.atStartOfDay(ZoneId.systemDefault()));
		XMLGregorianCalendar dateFin = null;
		try {
			dateFin = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal2);
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Pret newPret = new Pret();
		
		newPret.setId(0);
		newPret.setUtilisateur(user);
		newPret.setOuvrage(ouvrage);
		newPret.setStatus(status);
		newPret.setDateDebut(dateDebut);
		newPret.setDateFin(dateFin);
		newPret.setProlongation(false);
		
		
		GestionPretService servicePret = new GestionPretService();
		GestionPret pretService = servicePret.getGestionPretPort();
		
		pretService.addPret(newPret);
		
		return ActionSupport.SUCCESS;
		
	}
	
	public String doPretDetail() {
		GestionPretService servicePret = new GestionPretService();
		GestionPret pretService = servicePret.getGestionPretPort();
		
		pret = pretService.getPretByID(id); 
		XMLGregorianCalendar xCal = pret.getDateFin();
		dateFinReservation = xCal.toGregorianCalendar().getTime();
		XMLGregorianCalendar xCal2 = pret.getDateDebut();
		dateReservation = xCal2.toGregorianCalendar().getTime();
		
		
		return ActionSupport.SUCCESS;
		
	}
	
	public String doListPret() {
		GestionPretService servicePret = new GestionPretService();
		GestionPret pretService = servicePret.getGestionPretPort();
		ConvertUser userConvert = new ConvertUser();
		com.vianney.ws.gestionuser.Utilisateur utilisateur = new com.vianney.ws.gestionuser.Utilisateur();
		utilisateur=(com.vianney.ws.gestionuser.Utilisateur) session.get("user");
		user = userConvert.utilisateurToUtilisateurPret(utilisateur);
		
		listPret=pretService.getListPretByUser(user);
		
		
		return ActionSupport.SUCCESS;
		
	}
	
	public String doProlongation() {
		GestionPretService servicePret = new GestionPretService();
		GestionPret pretService = servicePret.getGestionPretPort();
		
		pret = pretService.getPretByID(id);
		
		
		XMLGregorianCalendar xCal = pret.getDateFin();
		LocalDateTime newDateFin = xCal.toGregorianCalendar().toZonedDateTime().toLocalDateTime();
		newDateFin = newDateFin.plus(prolongationPret, ChronoUnit.WEEKS);
		
		LocalDate dateF = newDateFin.toLocalDate();
		GregorianCalendar gcal2 = GregorianCalendar.from(dateF.atStartOfDay(ZoneId.systemDefault()));
		XMLGregorianCalendar dateFin = null;
		try {
			dateFin = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal2);
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		pret.setDateFin(dateFin);
		pret.setProlongation(true);
		
		pretService.updatePret(pret);
		
		return ActionSupport.SUCCESS;
		
	}
	
	public String doEndPret() {
		GestionPretService servicePret = new GestionPretService();
		GestionPret pretService = servicePret.getGestionPretPort();
		
		pret = pretService.getPretByID(id);
		
		Status status = new Status();
		status.setId(2);
		status.setStatus("fini");
		
		pret.setStatus(status);
		pretService.updatePret(pret);
		
		return ActionSupport.SUCCESS;
		
	}

	
	
}
