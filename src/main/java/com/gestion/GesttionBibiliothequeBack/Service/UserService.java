package com.gestion.GesttionBibiliothequeBack.Service;

import com.gestion.GesttionBibiliothequeBack.Entity.Consultation;
import com.gestion.GesttionBibiliothequeBack.Entity.User;
import com.gestion.GesttionBibiliothequeBack.Exception.UserNotFoundException;
import com.gestion.GesttionBibiliothequeBack.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User Save(User user){
        return repo.save(user);
    }

    public List<User> getUsers(){
        return repo.findAll();
    }

    public User getUserById(int id){
        Optional<User> user = Optional.ofNullable(repo.findById(id).orElseThrow(() ->
                new UserNotFoundException(id)));
        return user.get();
    }

    public void deleteById(Integer id){
        repo.deleteById(id);
    }

}
