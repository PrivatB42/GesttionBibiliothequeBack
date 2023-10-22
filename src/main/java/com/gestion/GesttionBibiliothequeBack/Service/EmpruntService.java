package com.gestion.GesttionBibiliothequeBack.Service;

import com.gestion.GesttionBibiliothequeBack.Entity.Emprunt;
import com.gestion.GesttionBibiliothequeBack.Entity.User;
import com.gestion.GesttionBibiliothequeBack.Exception.EmpruntNotFoundException;
import com.gestion.GesttionBibiliothequeBack.Exception.ExemplaireNotFoundException;
import com.gestion.GesttionBibiliothequeBack.Repository.EmpruntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class EmpruntService {

    @Autowired
    private EmpruntRepository repo;

    public Emprunt Save(Emprunt emprunt){

        String timestamp = ZonedDateTime.now(ZoneId.of("Africa/Abidjan"))
                .format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss"));

        emprunt.setDateEmprunt(timestamp);
        emprunt.setEtat("en-cours");
        return repo.save(emprunt);
    }

    public List<Emprunt> getEmprunt(){
        return repo.findAll();
    }

    public Emprunt getEmpruntById(int id){
        Optional<Emprunt> emprunt = Optional.ofNullable(repo.findById(id).orElseThrow(() ->
                new EmpruntNotFoundException(id)));
        return emprunt.get();
    }

    public void deleteById(Integer id){
        repo.deleteById(id);
    }

    public Emprunt RetoutEmprunt(int id){

        Emprunt emprunt = getEmpruntById(id);

        String timestamp = ZonedDateTime.now(ZoneId.of("Africa/Abidjan"))
                .format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss"));

        emprunt.setDateRetour(timestamp);
        emprunt.setEtat("rendu");
        return repo.save(emprunt);
    }

}
