package com.gestion.GesttionBibiliothequeBack.Service;

import com.gestion.GesttionBibiliothequeBack.Entity.Livre;
import com.gestion.GesttionBibiliothequeBack.Entity.User;
import com.gestion.GesttionBibiliothequeBack.Exception.LivreNotFoundException;
import com.gestion.GesttionBibiliothequeBack.Exception.UserNotFoundException;
import com.gestion.GesttionBibiliothequeBack.Repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreService {

    @Autowired
    private LivreRepository repo;

    public Livre Save(Livre livre){
        System.out.println("Enregistrement du livre ");
        return repo.save(livre);
    }

    public List<Livre> getLivre(){
        return repo.findAll();
    }

    public Livre getLivreById(int id){
        Optional<Livre> livre = Optional.ofNullable(repo.findById(id).orElseThrow(() ->
                new LivreNotFoundException(id)));
        return livre.get();
    }

    public void deleteById(Integer id){
        repo.deleteById(id);
    }

}
