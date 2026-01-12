package com.example.electratrack.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "invoices")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "job_id")
    private Job job;

    private String invoiceNumber;
    private String status; // DRAFT, SENT, PAID, OVERDUE
    private Double totalAmount;
    private LocalDate issuedDate;
    private LocalDate dueDate;
}