package com.gestion.GesttionBibiliothequeBack.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Exemplaire {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Id;

    @Column(name="nbreexemplaire")
    private int NbreExemplaire;

    @ManyToOne
    @JoinColumn(name = "livre_id")
    private Livre Livre;

}
