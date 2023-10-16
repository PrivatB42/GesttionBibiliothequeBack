package com.gestion.GesttionBibiliothequeBack.Service;

import com.gestion.GesttionBibiliothequeBack.Entity.Consultation;
import com.gestion.GesttionBibiliothequeBack.Repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultationService{

    @Autowired
    private ConsultationRepository repo;


    public void Save(Consultation consultation){
        repo.save(consultation);
    }

    public List<Consultation> getConsultations(){
        return repo.findAll();
    }

    public Consultation getConsultationById(int id){
        Optional<Consultation> consult = repo.findById(id);
        return consult.get();
    }

    public void deleteById(Integer id){
        repo.deleteById(id);
    }


}
