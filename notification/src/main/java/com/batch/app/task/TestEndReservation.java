package com.batch.app.task;

import com.vianney.ws.gestionreservation.GestionReservation;
import com.vianney.ws.gestionreservation.GestionReservationService;
import com.vianney.ws.gestionreservation.Reservation;
import org.springframework.stereotype.Component;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.Date;

@Component
public class TestEndReservation {

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
}
