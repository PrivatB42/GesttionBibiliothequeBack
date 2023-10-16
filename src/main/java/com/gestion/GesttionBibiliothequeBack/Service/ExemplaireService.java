package com.gestion.GesttionBibiliothequeBack.Service;

import com.gestion.GesttionBibiliothequeBack.Entity.Exemplaire;
import com.gestion.GesttionBibiliothequeBack.Entity.User;
import com.gestion.GesttionBibiliothequeBack.Repository.ExemplaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExemplaireService {

    @Autowired
    private ExemplaireRepository repo;


    public void Save(Exemplaire exemplaire){
        repo.save(exemplaire);
    }

    public List<Exemplaire> getExemplaire(){
        return repo.findAll();
    }

    public Exemplaire getExemplaireById(int id){
        Optional<Exemplaire> exemplaire = repo.findById(id);
        return exemplaire.get();
    }

    public void deleteById(Integer id){
        repo.deleteById(id);
    }

}
