package com.batch.app.scheduler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.batch.app.mail.ApacheMail;
import com.vianney.ws.gestionrelance.GestionRelance;
import com.vianney.ws.gestionrelance.GestionRelanceService;
import com.vianney.ws.gestionrelance.Pret;
import com.vianney.ws.gestionrelance.Utilisateur;

@Component
public class BatchTasklet implements Tasklet {
 
  @Value("${batch.message}") private String message;
 
  @Autowired
  private ApacheMail mail;
 
  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
    System.out.println(message);
    GestionRelanceService serviceRelance = new GestionRelanceService();
    GestionRelance service = serviceRelance.getGestionRelancePort();
    
    List<Pret> listNonRendu = service.getListPretNonRendu();
    Iterator<Pret> it = listNonRendu.iterator();
    
    List<Utilisateur> listUser = new ArrayList<Utilisateur>();
      
    while(it.hasNext()) {
    	Pret pret = it.next();
      	listUser.add(pret.getUtilisateur());
    	
    }
    for(int i = 0; i < listUser.size(); i++) {
        for(int j = i + 1; j < listUser.size(); j++) {
            if(listUser.get(i).getId()==listUser.get(j).getId()){
            	listUser.remove(j);
                j--;
            }
        }
    } 
    
   Iterator<Utilisateur> it2 = listUser.iterator();
   while(it2.hasNext()) {
	   Utilisateur user = it2.next();
	   List<Pret> listPret = service.getListPretNonRenduByUser(user);
	   mail.send(user,listPret);
   }
   
   
    return RepeatStatus.FINISHED;
  }


}
