package com.gestion.GesttionBibiliothequeBack.Repository;

import com.gestion.GesttionBibiliothequeBack.Entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository<Livre,Integer> {
}
