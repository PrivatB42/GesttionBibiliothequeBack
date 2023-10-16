package com.gestion.GesttionBibiliothequeBack.Service;

import com.gestion.GesttionBibiliothequeBack.Entity.Emprunt;
import com.gestion.GesttionBibiliothequeBack.Entity.User;
import com.gestion.GesttionBibiliothequeBack.Repository.EmpruntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpruntService {

    @Autowired
    private EmpruntRepository repo;

    public void Save(Emprunt emprunt){
        repo.save(emprunt);
    }

    public List<Emprunt> getEmprunt(){
        return repo.findAll();
    }

    public Emprunt getEmpruntById(int id){
        Optional<Emprunt> emprunt = repo.findById(id);
        return emprunt.get();
    }

    public void deleteById(Integer id){
        repo.deleteById(id);
    }

}
