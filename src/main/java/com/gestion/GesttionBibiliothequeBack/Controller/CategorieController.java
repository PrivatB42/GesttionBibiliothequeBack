package com.gestion.GesttionBibiliothequeBack.Controller;

import com.gestion.GesttionBibiliothequeBack.Entity.Categorie;
import com.gestion.GesttionBibiliothequeBack.Service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Classe permet de gerer les categories
@RestController
@RequestMapping("/biblio/categorie")
public class CategorieController {

    @Autowired
    private CategorieService service;

    @PostMapping("/add")
    public Categorie savecategorie(@RequestBody Categorie categorie){
        return service.Save(categorie);
    }


    @GetMapping("/{id}")
    public Categorie getcategorie(@PathVariable int id){
        return service.findById(id);
    }


    @GetMapping("/all")
    public List<Categorie> getcategorieList(){
        return service.getCategorie();
    }


    @DeleteMapping("/delete/{id}")
    public void deletecategorie(@PathVariable int id){
        service.deleteById(id);
    }

}
