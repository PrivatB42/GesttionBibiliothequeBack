package com.gestion.GesttionBibiliothequeBack.Repository;

import com.gestion.GesttionBibiliothequeBack.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
