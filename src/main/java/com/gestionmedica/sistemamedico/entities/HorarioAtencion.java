package com.gestionmedica.sistemamedico.entities;

import com.gestionmedica.sistemamedico.enums.Enums.DiaSemana;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Table(name = "horarios_atencion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HorarioAtencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private DiaSemana dia;

    @Column(nullable = false)
    private LocalTime horaInicio;

    @Column(nullable = false)
    private LocalTime horaFin;

    @ManyToOne
    private Medico medico;
}
