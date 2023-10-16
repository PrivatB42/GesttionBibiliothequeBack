package com.gestion.GesttionBibiliothequeBack.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Categorie {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Id;

    @Column(name="libelle")
    private String Libelle;

}
