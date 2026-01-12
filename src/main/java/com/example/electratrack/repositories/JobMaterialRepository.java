package com.example.electratrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.electratrack.entities.JobMaterial;

import java.util.Optional;

public interface JobMaterialRepository extends JpaRepository<JobMaterial, Long> {
    Optional<JobMaterial> findByEmail(String email);
}