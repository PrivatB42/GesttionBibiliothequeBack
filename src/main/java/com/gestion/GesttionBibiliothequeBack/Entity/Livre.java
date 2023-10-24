package com.gestion.GesttionBibiliothequeBack.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Entity
@Data
public class Livre {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="titre", length=45)
    private String titre;

    @Column(name ="datedeparution")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date datedeparution;

    @Column(name="nomauteur",length = 45)
    private String nomauteur;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

}
