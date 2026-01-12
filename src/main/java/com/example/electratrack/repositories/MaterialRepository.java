package com.example.electratrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.electratrack.entities.Material;

import java.util.Optional;

public interface MaterialRepository extends JpaRepository<Material, Long> {
    Optional<Material> findByEmail(String email);
}
