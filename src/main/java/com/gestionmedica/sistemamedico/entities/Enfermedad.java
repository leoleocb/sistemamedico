package com.gestionmedica.sistemamedico.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "enfermedades")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Enfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @ManyToOne
    private Paciente paciente;
}
