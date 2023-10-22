package com.gestion.GesttionBibiliothequeBack.Service;

import com.gestion.GesttionBibiliothequeBack.Entity.Consultation;
import com.gestion.GesttionBibiliothequeBack.Entity.User;
import com.gestion.GesttionBibiliothequeBack.Exception.UserNotFoundException;
import com.gestion.GesttionBibiliothequeBack.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public User Save(User user){
        System.out.println("Utilisateur Crée avec succès");
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

    public List<User> getUsers(){
        List<User> users = repo.findAll();
        System.out.println("Liste de tous les utilisateurs " +users);
        return users;
    }

    public User getUserById(int id){
        Optional<User> user = Optional.ofNullable(repo.findById(id).orElseThrow(() ->
                new UserNotFoundException(id)));
        System.out.println("L'utilisateur avec l'id " + id + " est " + user);
        return user.get();
    }

    public void deleteById(Integer id){
        System.out.println("Suppression de ;'utilisateur avec l'id " + id);
        repo.deleteById(id);
    }

}
