package com.gestion.GesttionBibiliothequeBack.Repository;

import com.gestion.GesttionBibiliothequeBack.Entity.Exemplaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExemplaireRepository extends JpaRepository<Exemplaire,Integer> {
}
