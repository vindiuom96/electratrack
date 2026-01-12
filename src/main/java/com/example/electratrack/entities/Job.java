package com.example.electratrack.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "jobs")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @Column(length = 2000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // optionally a site field
    private String siteName;
    private String status; // NEW, IN_PROGRESS, WAITING_PAYMENT, DONE
    private LocalDateTime startDate;
    private LocalDateTime dueDate;

    private Double labourCost;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<JobMaterial> jobMaterials;
}