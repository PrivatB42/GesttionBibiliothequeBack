package com.gestion.GesttionBibiliothequeBack.Controller;

import com.gestion.GesttionBibiliothequeBack.Entity.Emprunt;
import com.gestion.GesttionBibiliothequeBack.Service.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Classe permet de gerer les emprunts
@CrossOrigin
@RestController
@RequestMapping("/biblio/emprunt")
public class EmpruntController {

    @Autowired
    private EmpruntService service;

    @CrossOrigin
    @PostMapping("/add")
    public Emprunt addemprunt(@RequestBody Emprunt emprunt) {
        return service.Save(emprunt);
    }

    @CrossOrigin
    @GetMapping("/retour/{id}")
    public Emprunt RetourEmprunt(@PathVariable int id) {
        return service.RetoutEmprunt(id);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Emprunt getEmprunt(@PathVariable int id){
        return service.getEmpruntById(id);
    }

    @CrossOrigin
    @GetMapping("/all")
    public List<Emprunt> getEmpruntList(){
        return service.getEmprunt();
    }

    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        service.deleteById(id);
    }



}
