package com.batch.app.expiration;

import com.batch.app.mail.ApacheMail;
import com.vianney.ws.gestionpret.GestionPret;
import com.vianney.ws.gestionpret.GestionPretService;
import com.vianney.ws.gestionpret.Pret;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Component
public class BatchTasklet implements Tasklet {

    @Value("${batch.message}") private String message;

    @Autowired
    private ApacheMail mail;


    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        System.out.println(message);

        GestionPretService pretService = new GestionPretService();
        GestionPret gestionPret = pretService.getGestionPretPort();

        List<Pret> list = gestionPret.getListPretEnCours();

        List<Pret> pretList = testDatePret(list);

        for(Pret pret : pretList){
            if(!pret.isProlongation()){
                mail.send(pret);
                pret.setNotification(true);
                gestionPret.updatePret(pret);
            }
        }

        return RepeatStatus.FINISHED;
    }

    public List<Pret> testDatePret(List<Pret> list){
        List<Pret> pretList = new ArrayList<Pret>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateNow = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dateNow);
        c.add(Calendar.DATE, 5);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND,0);
        dateNow = c.getTime();

        for (Pret tempPret : list){
            Date date = tempPret.getDateFin().toGregorianCalendar().getTime();

            if(date.compareTo(dateNow)==0){
                pretList.add(tempPret);
            }
        }
        return pretList;
    }


}
