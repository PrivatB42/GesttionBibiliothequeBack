package com.gestion.GesttionBibiliothequeBack.Service;

import com.gestion.GesttionBibiliothequeBack.Entity.Categorie;
import com.gestion.GesttionBibiliothequeBack.Repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository repo;


    public void Save(Categorie categorie){
        repo.save(categorie);
    }

    public List<Categorie> getCategorie (){
        return repo.findAll();
    }

    public Categorie findById (Integer id){
        Optional<Categorie> categorie = repo.findById(id);
        return categorie.get();
    }

    public void deleteById(Integer id){
        repo.deleteById(id);
    }


}
