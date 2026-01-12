package com.example.electratrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.electratrack.entities.Job;

import java.util.Optional;

public interface JobRepository extends JpaRepository<Job, Long> {
    Optional<Job> findByEmail(String email);
}