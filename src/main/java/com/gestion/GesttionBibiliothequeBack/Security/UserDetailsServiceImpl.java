package com.gestion.GesttionBibiliothequeBack.Security;

import com.gestion.GesttionBibiliothequeBack.Entity.User;
import com.gestion.GesttionBibiliothequeBack.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);
/*       List<SimpleGrantedAuthority> grantedAuthorities = user.getRole().getLibelle()
                .map(authority -> new SimpleGrantedAuthority(authority)).collect(Collectors.toList()); */// (1)
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getRole().getLibelle());

        System.out.println("authority de l'utilisateur 1 "+ new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), Collections.singleton(authority)));
/*
        System.out.println("authority de l'utilisateur "+ new MyUserDetails(user));
*/
/*
        return new User(user.getUsername(), user.getPassword(),  Collections.singleton(authority));
*/
        /*return new MyUserDetails(user);*/
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), Collections.singleton(authority)); // (2)

    }

}