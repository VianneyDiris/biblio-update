package com.batch.app.mail;

import com.vianney.ws.gestionpret.Pret;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

@Component
public class ApacheMail {

    @Value("${batch.mail}")
    private String mail;

    @Value("${batch.password}")
    private String password;

    public void send(Pret pret) {
        // Create the email message
        HtmlEmail email = new HtmlEmail();

        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(mail, password));
        email.setSSLOnConnect(true);
        try {
            email.addTo(pret.getUtilisateur().getMail(), pret.getUtilisateur().getNom());
            email.setFrom(mail, "Moi");
            email.setSubject("Notification de fin de location");

            // set the html message

            String message = "<html>Bonjour "+pret.getUtilisateur().getNom()+",";
            message+="<br>Merci de nous retourner l'ouvrage suivant : <ul>";


            SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            fmt.setCalendar(pret.getDateFin().toGregorianCalendar());
            String dateFormatted = fmt.format(pret.getDateFin().toGregorianCalendar().getTime());

            message+="<li>\""+pret.getOuvrage().getTitre()+"\" doit être rendu le "+dateFormatted+"</li> ";


            message+="</ul>";
            URL url = new URL("http://localhost:8080/bibliotheque-webapp/images/mini/"+pret.getOuvrage().getPhotos());
            String cid = email.embed(url, pret.getOuvrage().getTitre());

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

