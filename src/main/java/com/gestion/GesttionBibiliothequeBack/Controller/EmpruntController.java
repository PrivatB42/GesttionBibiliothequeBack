package com.gestion.GesttionBibiliothequeBack.Controller;

import com.gestion.GesttionBibiliothequeBack.Entity.Emprunt;
import com.gestion.GesttionBibiliothequeBack.Service.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Classe permet de gerer les emprunts
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/biblio/emprunt")
public class EmpruntController {

    @Autowired
    private EmpruntService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/add")
    public Emprunt addemprunt(@RequestBody Emprunt emprunt) {
        return service.Save(emprunt);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/retour/{id}")
    public Emprunt RetourEmprunt(@PathVariable int id) {
        return service.RetoutEmprunt(id);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{id}")
    public Emprunt getEmprunt(@PathVariable int id){
        return service.getEmpruntById(id);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/all")
    public List<Emprunt> getEmpruntList(){
        return service.getEmprunt();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        service.deleteById(id);
    }



}
