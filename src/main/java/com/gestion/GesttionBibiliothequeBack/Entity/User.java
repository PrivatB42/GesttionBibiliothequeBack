package com.gestion.GesttionBibiliothequeBack.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "nom", length = 45, nullable = false)
    private String Nom;

    @Column(name = "prenom", length = 45, nullable = false)
    private String Prenom;

    @Column(name = "username", length = 45, nullable = false)
    private String Username;

    @Column(name = "email", length = 45)
    private String Email;

    @Column(name = "password", nullable = false)
    private String Password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role Role;



}
