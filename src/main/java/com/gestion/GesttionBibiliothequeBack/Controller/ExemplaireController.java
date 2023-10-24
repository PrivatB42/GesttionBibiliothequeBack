package com.gestion.GesttionBibiliothequeBack.Controller;

import com.gestion.GesttionBibiliothequeBack.Entity.Exemplaire;
import com.gestion.GesttionBibiliothequeBack.Entity.Livre;
import com.gestion.GesttionBibiliothequeBack.Service.ExemplaireService;
import com.gestion.GesttionBibiliothequeBack.Service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Cette classe permet de gerer les informations des exemplaires
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/biblio/exemplaire")
public class ExemplaireController {

    @Autowired
    private ExemplaireService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/add")
    public Exemplaire saveExemplaire(@RequestBody Exemplaire exemplaire){
        return service.Save(exemplaire);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{id}")
    public Exemplaire getExemplaire(@PathVariable int id){
        return service.getExemplaireById(id);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/all")
    public List<Exemplaire> getLivreList(){
        return service.getExemplaire();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/delete/{id}")
    public void deletecategorie(@PathVariable int id){
        service.deleteById(id);
    }
}
