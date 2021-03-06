package com.batch.app.notification;

import com.batch.app.task.ConvertOuvrage;
import com.batch.app.task.Mail;
import com.vianney.ws.gestionpret.GestionPret;
import com.vianney.ws.gestionpret.GestionPretService;
import com.vianney.ws.gestionpret.Ouvrage;
import com.vianney.ws.gestionpret.Pret;
import com.vianney.ws.gestionreservation.GestionReservation;
import com.vianney.ws.gestionreservation.GestionReservationService;
import com.vianney.ws.gestionreservation.Reservation;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.*;

@Component
public class BatchTasklet implements Tasklet {

    @Value("${batch.message}") private String message;

    @Autowired
    private Mail mail;

    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        System.out.println(message);

        GestionReservationService serviceReservation = new GestionReservationService();
        GestionReservation gestionReservation = serviceReservation.getGestionReservationPort();

        List<Reservation> reservationList = gestionReservation.listReservation();

        for(Reservation tempReservation :reservationList){
            testFinReservation(tempReservation);
        }

        List<Reservation> reservationList2 = gestionReservation.listReservation();
        List<Ouvrage> list = listerOuvrageEnReservation(reservationList2);
        ConvertOuvrage convertOuvrage = new ConvertOuvrage();

        for(Ouvrage ouvrage : list){
            if(testRetourOuvrage(ouvrage)){
                List<Reservation> reservations = gestionReservation.searchReservationByOuvrage(convertOuvrage.ouvrageToOuvrageReservation(ouvrage));
                Reservation reservation = testPremierReservation(reservations);
                if(!reservation.isNotification()){
                    mail.send(reservation);

                    Date date = new Date();
                    GregorianCalendar c = new GregorianCalendar();
                    c.setTime(date);
                    XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

                    reservation.setNotification(true);
                    reservation.setDateNotification(date2);
                    gestionReservation.updateReservation(reservation);
                }
            }
        }

        return RepeatStatus.FINISHED;
    }


    public void testFinReservation(Reservation reservation){
        if(reservation.isNotification()){
            XMLGregorianCalendar xcal = reservation.getDateNotification();
            Date date = xcal.toGregorianCalendar().getTime();

            Date dateNow = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.DATE, 2);
            date = c.getTime();

            if(date.compareTo(dateNow)<0 || date.compareTo(dateNow)==0){
                GestionReservationService serviceReservation = new GestionReservationService();
                GestionReservation gestionReservation = serviceReservation.getGestionReservationPort();

                gestionReservation.deleteReservation(reservation);
            }

        }
    }

    public boolean testRetourOuvrage(Ouvrage ouvrage){
        GestionPretService pretService = new GestionPretService();
        GestionPret gestionPret = pretService.getGestionPretPort();

        List<Pret> pretList = gestionPret.getListPretByOuvrage(ouvrage);
        int nbPretEnCours = 0;

        for(Pret pret : pretList){
            if(pret.getStatus().getId()==1){
                nbPretEnCours+=1;
            }
        }

        if(nbPretEnCours<ouvrage.getExemplaire()){
            return true;
        }

        return false;
    }


    public Reservation testPremierReservation(List<Reservation> reservationList){
       Reservation reservation = new Reservation();

       Collections.sort(reservationList, new Comparator<Reservation>() {
            public int compare(Reservation o1, Reservation o2) {
                if (o1.getDateReservation() == null || o2.getDateNotification() == null)
                    return 0;
                return o1.getDateReservation().toGregorianCalendar().getTime().compareTo(o2.getDateReservation().toGregorianCalendar().getTime());
            }
        });

        reservation = reservationList.get(0);

        return reservation;
    }

    public List<Ouvrage> listerOuvrageEnReservation(List<Reservation> list){
        List<Ouvrage> ouvrageList = new ArrayList<Ouvrage>();
        ConvertOuvrage convert = new ConvertOuvrage();

        Iterator<Reservation> it = list.iterator();
        while(it.hasNext()) {
            Reservation reserv = it.next();
            ouvrageList.add(convert.ouvrageToOuvragePret(reserv.getOuvrage()));

        }
        for(int i = 0; i < ouvrageList.size(); i++) {
            for(int j = i + 1; j < ouvrageList.size(); j++) {
                if(ouvrageList.get(i).getId()==ouvrageList.get(j).getId()){
                    ouvrageList.remove(j);
                    j--;
                }
            }
        }

        return ouvrageList;
    }
}
