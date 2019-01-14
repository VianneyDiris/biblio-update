package com.batch.app.task;

import com.vianney.ws.gestionreservation.Reservation;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Value;

import java.net.MalformedURLException;
import java.net.URL;


public class Mail {

    @Value("${batch.mail}")
    private String mail;

    @Value("${batch.password}")
    private String password;

    public void send(Reservation reservation) {
        // Create the email message
        HtmlEmail email = new HtmlEmail();

        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(mail, password));
        email.setSSLOnConnect(true);
        try {
            email.addTo(reservation.getUtilisateur().getMail(), reservation.getUtilisateur().getNom());
            email.setFrom(mail, "Moi");
            email.setSubject("Votre livre est arrivé");


            String message = "<html>Bonjour "+reservation.getUtilisateur().getNom();
            message+="<br>L'ouvrage suivant est arrivé à la bibliothèque : <ul>";
            message+="<li>\""+reservation.getOuvrage().getTitre()+"\"</li> ";
                // mettre date de retour + à la ligne
            message+="</ul>";


            URL url = new URL("http://localhost:8080/bibliotheque-webapp/images/mini/"+reservation.getOuvrage().getPhotos());
            String cid = email.embed(url, reservation.getOuvrage().getTitre());

            message+= "<img src=\"cid:"+cid+"\"><span></span> <span></span>";
            message+="<br> Merci <br> Cordialement <br>";

            URL url2 = new URL("http://localhost:8080/bibliotheque-webapp/images/mini/openclassroom.jpg");
            String cid2 = email.embed(url2, "logo");
            message+= "<img src=\"cid:"+cid2+"\">";

            email.setHtmlMsg(message);

            // set the alternative message
            email.setTextMsg("Your email client does not support HTML messages");

            // send the email
            email.send();
            System.out.println("Mail has been sent successfully");
        }
        catch (EmailException e) {
            // TODO Auto-generated catch block
            System.out.println("Unable to send an email" + e.getMessage());
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            System.out.println("Unable to send an email" + e.getMessage());
        }

    }

}
