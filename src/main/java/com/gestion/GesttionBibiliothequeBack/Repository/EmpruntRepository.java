package com.gestion.GesttionBibiliothequeBack.Repository;

import com.gestion.GesttionBibiliothequeBack.Entity.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt, Integer> {
}
