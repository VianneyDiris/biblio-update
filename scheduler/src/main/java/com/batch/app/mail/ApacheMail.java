package com.batch.app.mail;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vianney.ws.gestionrelance.Pret;
import com.vianney.ws.gestionrelance.Utilisateur;

@Component
public class ApacheMail {
	
	@Value("${batch.mail}") 
	private String mail;
	
	@Value("${batch.password}") 
	private String password;
	
	public void send(Utilisateur user, List<Pret> listPret) {
		// Create the email message
		  HtmlEmail email = new HtmlEmail();
		  
		  email.setHostName("smtp.googlemail.com");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator(mail, password));
		  email.setSSLOnConnect(true);
		  try {
			  email.addTo(user.getMail(), user.getNom());
			  email.setFrom(mail, "Moi");
			  email.setSubject("Fin de location");
			  
			  // embed the image and get the content id
//			  URL url = new URL("http://localhost:8080/bibliotheque-webapp/images/dune.jpg");
//			  String cid = email.embed(url, "Dune");
			  
			  // set the html message
			  
			  String message = "<html>Bonjour "+user.getNom();
			  message+="<br>Merci de nous retourner les ouvrages suivants : <ul>";
			  Iterator<Pret> it = listPret.iterator();
	        	while(it.hasNext()) {
	        		Pret pret = it.next();
	        		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
	        	    fmt.setCalendar(pret.getDateFin().toGregorianCalendar());
	        	    String dateFormatted = fmt.format(pret.getDateFin().toGregorianCalendar().getTime());
	        		
	        		message+="<li>\""+pret.getOuvrage().getTitre()+"\" devait être rendu le "+dateFormatted+"</li> ";
	        		// mettre date de retour + à la ligne
	        	}
	        	message+="</ul>";
	        	Iterator<Pret> it2 = listPret.iterator();
	        	while(it2.hasNext()) {
	        		Pret pret = it2.next();
	        	    URL url = new URL("http://localhost:8080/bibliotheque-webapp/images/mini/"+pret.getOuvrage().getPhotos());
	   			    String cid = email.embed(url, pret.getOuvrage().getTitre());
	   			    
	   			    message+= "<img src=\"cid:"+cid+"\"><span></span> <span></span>";
	        		
	        		
	        	}
	        	
			  message+="<br> Merci <br> Cordialement <br>";
			  
			  URL url = new URL("http://localhost:8080/bibliotheque-webapp/images/mini/openclassroom.jpg");
 			  String cid = email.embed(url, "logo");
 			  message+= "<img src=\"cid:"+cid+"\">";
			  
			  email.setHtmlMsg(message);
			  
			  //tu dois corriger la taille des images
			  
			  
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
