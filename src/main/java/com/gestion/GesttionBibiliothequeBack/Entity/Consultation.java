package com.gestion.GesttionBibiliothequeBack.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Entity
@Data
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date DateConsultation;

    @Column(name = "nbreconsultation")
    private int NbreConsultation;

    @ManyToOne
    @JoinColumn(name = "Exemplare_id")
    private Exemplaire Exemplaire;

}
