package com.batch.app.notification;

import com.batch.app.task.TestEndReservation;
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

import java.util.List;

@Component
public class BatchTasklet implements Tasklet {

    @Value("${batch.message}") private String message;

    @Autowired
    private TestEndReservation test;

    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        System.out.println(message);

        GestionReservationService serviceReservation = new GestionReservationService();
        GestionReservation gestionReservation = serviceReservation.getGestionReservationPort();

        List<Reservation> reservationList = gestionReservation.listReservation();

        for(Reservation tempReservation :reservationList){
            test.testFinReservation(tempReservation);
        }

        return RepeatStatus.FINISHED;
    }
}
