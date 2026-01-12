package com.example.electratrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.electratrack.entities.Invoice;

import java.util.Optional;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    Optional<Invoice> findByEmail(String email);
}