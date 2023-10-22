package com.gestion.GesttionBibiliothequeBack.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Entity
@Data
public class Emprunt {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Id;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String DateEmprunt;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String DateRetour;

    @Column(name="etat")
    private String Etat;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User User;

    @ManyToOne
    @JoinColumn(name="exemplaire_id")
    private Exemplaire Exemplaire;

}
