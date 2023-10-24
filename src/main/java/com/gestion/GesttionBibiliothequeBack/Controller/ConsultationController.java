package com.gestion.GesttionBibiliothequeBack.Controller;

import com.gestion.GesttionBibiliothequeBack.Entity.Consultation;
import com.gestion.GesttionBibiliothequeBack.Service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Classe permet d'enregistrer les informations de consultation
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/biblio/consultation")
public class ConsultationController {

    @Autowired
    private ConsultationService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/add")
    public Consultation addConsultation(@RequestBody Consultation consultation){
        return service.SaveConsultation(consultation);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/all")
    public List<Consultation> getConsultations(){
        return service.getConsultations();
    }

}
