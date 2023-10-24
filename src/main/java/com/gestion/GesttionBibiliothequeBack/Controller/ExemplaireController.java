package com.gestion.GesttionBibiliothequeBack.Controller;

import com.gestion.GesttionBibiliothequeBack.Entity.Exemplaire;
import com.gestion.GesttionBibiliothequeBack.Entity.Livre;
import com.gestion.GesttionBibiliothequeBack.Service.ExemplaireService;
import com.gestion.GesttionBibiliothequeBack.Service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Cette classe permet de gerer les informations des exemplaires
@CrossOrigin
@RestController
@RequestMapping("/biblio/exemplaire")
public class ExemplaireController {

    @Autowired
    private ExemplaireService service;

    @CrossOrigin
    @PostMapping("/add")
    public Exemplaire saveExemplaire(@RequestBody Exemplaire exemplaire){
        return service.Save(exemplaire);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Exemplaire getExemplaire(@PathVariable int id){
        return service.getExemplaireById(id);
    }

    @CrossOrigin
    @GetMapping("/all")
    public List<Exemplaire> getLivreList(){
        return service.getExemplaire();
    }

    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    public void deletecategorie(@PathVariable int id){
        service.deleteById(id);
    }
}
