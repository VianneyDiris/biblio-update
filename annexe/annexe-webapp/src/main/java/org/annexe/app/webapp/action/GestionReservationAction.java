package org.annexe.app.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import com.vianney.ws.gestionouvrage.GestionOuvrage;
import com.vianney.ws.gestionouvrage.GestionOuvrageService;
import com.vianney.ws.gestionreservation.GestionReservation;
import com.vianney.ws.gestionreservation.GestionReservationService;
import com.vianney.ws.gestionreservation.Ouvrage;
import com.vianney.ws.gestionreservation.Reservation;
import com.vianney.ws.gestionreservation.Utilisateur;
import org.annexe.app.webapp.convert.ConvertOuvrage;
import org.annexe.app.webapp.convert.ConvertUser;
import org.apache.struts2.interceptor.SessionAware;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

public class GestionReservationAction extends ActionSupport implements SessionAware {
    // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private Integer id;
    private Map<String, Object> session;
    private Utilisateur user;

    // ----- Paramètres en sortie
    private Ouvrage ouvrage;
    private Reservation reservation;
    private List<Reservation> reservationList;
    private Date dateFinReservation;
    private int position;

    // ==================== Getters/Setters ====================

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public Map<String, Object> getSession() {
        return session;
    }
    public void setSession(Map<String, Object> pSession) {
        // TODO Auto-generated method stub
        this.session=pSession;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public Date getDateFinReservation() {
        return dateFinReservation;
    }

    public void setDateFinReservation(Date dateFinReservation) {
        this.dateFinReservation = dateFinReservation;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    // ==================== Méthodes ====================
    public String doListReservation(){
        ConvertUser userConvert = new ConvertUser();
        com.vianney.ws.gestionuser.Utilisateur utilisateur = new com.vianney.ws.gestionuser.Utilisateur();
        utilisateur=(com.vianney.ws.gestionuser.Utilisateur) session.get("user");
        user = userConvert.utilisateurToUtilisateurReservation(utilisateur);

        GestionReservationService serviceReservation = new GestionReservationService();
        GestionReservation reservationService = serviceReservation.getGestionReservationPort();

        reservationList = reservationService.searchReservationByUtilisateur(user);

        return ActionSupport.SUCCESS;
    }

    public String doAddReservation(){
        ConvertUser userConvert = new ConvertUser();
        com.vianney.ws.gestionuser.Utilisateur utilisateur = new com.vianney.ws.gestionuser.Utilisateur();
        utilisateur=(com.vianney.ws.gestionuser.Utilisateur) session.get("user");
        user = userConvert.utilisateurToUtilisateurReservation(utilisateur);

        GestionOuvrageService serviceOuvrage = new GestionOuvrageService();
        GestionOuvrage ouvrageService = serviceOuvrage.getGestionOuvragePort();

        ConvertOuvrage convert = new ConvertOuvrage();
        ouvrage = convert.ouvrageToOuvrageReservation(ouvrageService.getOuvrageByID(id));

        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate date = currentTime.toLocalDate();
        GregorianCalendar gcal = GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));
        XMLGregorianCalendar dateReservation = null;
        try {
            dateReservation = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        } catch (DatatypeConfigurationException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Reservation addReserv = new Reservation();
        addReserv.setDateReservation(dateReservation);
        addReserv.setOuvrage(ouvrage);
        addReserv.setUtilisateur(user);
        addReserv.setNotification(false);

        GestionReservationService serviceReservation = new GestionReservationService();
        GestionReservation reservationService = serviceReservation.getGestionReservationPort();

        reservationService.addReservation(addReserv);

        return ActionSupport.SUCCESS;
    }

    public String doReservationDetail(){
        GestionReservationService serviceReservation = new GestionReservationService();
        GestionReservation reservationService = serviceReservation.getGestionReservationPort();

        reservation = reservationService.find(id);
        XMLGregorianCalendar xCal = reservation.getDateReservation();
        dateFinReservation = xCal.toGregorianCalendar().getTime();

        List<Reservation> list =reservationService.searchReservationByOuvrage(reservation.getOuvrage());
        position = 1;
        for (Reservation tempReservation : list){
            xCal = tempReservation.getDateReservation();
            Date date = xCal.toGregorianCalendar().getTime();
            if(date.compareTo(dateFinReservation)<0){
                position+=1;
            }
        }

        return ActionSupport.SUCCESS;
    }

    public String doEndReservation(){
        GestionReservationService serviceReservation = new GestionReservationService();
        GestionReservation reservationService = serviceReservation.getGestionReservationPort();
        reservation = reservationService.find(id);

        reservationService.deleteReservation(reservation);

        return ActionSupport.SUCCESS;
    }
}
