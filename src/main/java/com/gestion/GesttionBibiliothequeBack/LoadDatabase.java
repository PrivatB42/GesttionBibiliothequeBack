package com.gestion.GesttionBibiliothequeBack;

import com.gestion.GesttionBibiliothequeBack.Entity.User;
import com.gestion.GesttionBibiliothequeBack.Repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.gestion.GesttionBibiliothequeBack.Entity.Role;
import com.gestion.GesttionBibiliothequeBack.Repository.RoleRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Bean
    CommandLineRunner initDatabase(RoleRepository repository, UserRepository userRepository) {

        return args -> {
            log.info("Preloading " + repository.save(new Role(1,"ADMIN")));
            log.info("Preloading " + repository.save(new Role(2,"USER")));
            log.info("preloading " + userRepository.save(new User(1,"admin", "default", "admin", "admin@adin.com",encoder.encode("admin"),repository.findById(1).get())));
            log.info("preloading " + userRepository.save(new User(2,"user", "default", "user", "user@user.com",encoder.encode("user") ,repository.findById(2).get())));
        };
    }


}
