package com.gestion.GesttionBibiliothequeBack.Controller;

import com.gestion.GesttionBibiliothequeBack.Entity.Role;
import com.gestion.GesttionBibiliothequeBack.Entity.User;
import com.gestion.GesttionBibiliothequeBack.Repository.RoleRepository;
import com.gestion.GesttionBibiliothequeBack.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Cette classe permet de gerer les utilisateurs
@RestController
@CrossOrigin
@RequestMapping("/biblio/users")
public class UserController {


    @Autowired
    private UserService service;

    @Autowired
    private RoleRepository repo;

    @CrossOrigin
    @PostMapping("/save")
    public User SaveUser(@RequestBody User user){
        return service.Save(user);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public User GetOneUser(@PathVariable int id){
        return service.getUserById(id);
    }

    @CrossOrigin
    @GetMapping("/all")
    public List<User> getUsers(){
        return service.getUsers();
    }

    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id){
        service.deleteById(id);
    }

    @CrossOrigin
    @GetMapping("/role/all")
    public List<Role> getAllRoles(){
        return repo.findAll();
    }

    @CrossOrigin
    @GetMapping("/role/{id}")
    public Role getRole(@PathVariable int id){
        Optional<Role> role = repo.findById(id);
        return role.get();
    }

}
