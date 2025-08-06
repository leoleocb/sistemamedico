package com.gestionmedica.sistemamedico.entities;

import com.gestionmedica.sistemamedico.enums.*;
import com.gestionmedica.sistemamedico.enums.Enums.EstadoCita;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "citas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private LocalTime hora;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;

    @Enumerated(EnumType.STRING)
    private EstadoCita estado;

    private String motivo;

    private BigDecimal tarifaAplicada;
}
