package com.gestion.GesttionBibiliothequeBack.Controller;

import com.gestion.GesttionBibiliothequeBack.Entity.Livre;
import com.gestion.GesttionBibiliothequeBack.Service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//Cette classe permet de gerer les livres
@RestController
@RequestMapping("/biblio/livre")
public class LivreController {

    @Autowired
    private LivreService service;

    @PostMapping("/add")
    public Livre saveLivre(@RequestBody Livre livre){
        return service.Save(livre);
    }

    @GetMapping("/{id}")
    public Livre getLivre(@PathVariable int id){
        return service.getLivreById(id);
    }

    @GetMapping("/all")
    public List<Livre> getLivreList(){
        return service.getLivre();
    }

    @DeleteMapping("/delete/{id}")
    public void deletecategorie(@PathVariable int id){
        service.deleteById(id);
    }
}
