package com.batch.app.task;

import com.vianney.ws.gestionpret.GestionPret;
import com.vianney.ws.gestionpret.GestionPretService;
import com.vianney.ws.gestionpret.Ouvrage;
import com.vianney.ws.gestionpret.Pret;

import java.util.List;

public class TestRetourOuvrage {

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
}
