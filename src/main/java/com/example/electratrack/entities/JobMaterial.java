package com.example.electratrack.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "job_materials")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;

    private Integer quantityUsed;
    private Double lineTotal;
}