package com.gestion.GesttionBibiliothequeBack.Service;

import com.gestion.GesttionBibiliothequeBack.Entity.Consultation;
import com.gestion.GesttionBibiliothequeBack.Repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class ConsultationService{

    @Autowired
    private ConsultationRepository repo;


    public Consultation SaveConsultation(Consultation consultation){

        String timestamp = ZonedDateTime.now(ZoneId.of("Africa/Abidjan"))
                .format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss"));
        int nbreconsult = consultation.getNbreConsultation() + 1;
        consultation.setDateConsultation(timestamp);
        consultation.setNbreConsultation(nbreconsult);
         return repo.save(consultation);
    }

    public List<Consultation> getConsultations(){
        return repo.findAll();
    }

   /* public Consultation getConsultationById(int id){
        Optional<Consultation> consult = repo.findById(id);
        return consult.get();
    }

    public void deleteById(Integer id){
        repo.deleteById(id);
    }
*/

}
