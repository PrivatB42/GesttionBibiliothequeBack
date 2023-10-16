package com.gestion.GesttionBibiliothequeBack.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "libelle", length =45)
    private String Libelle;

}
