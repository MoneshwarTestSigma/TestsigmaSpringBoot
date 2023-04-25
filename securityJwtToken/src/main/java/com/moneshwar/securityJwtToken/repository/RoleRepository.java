package com.moneshwar.securityJwtToken.repository;

import com.moneshwar.securityJwtToken.model.ERole;
import com.moneshwar.securityJwtToken.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}