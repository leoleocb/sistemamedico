package com.gestionmedica.sistemamedico.dtos;

import com.gestionmedica.sistemamedico.enums.Enums.EstadoCita;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CitaDTO {
    private Long id;
    private LocalDate fecha;
    private LocalTime hora;
    private Long pacienteId;
    private Long medicoId;
    private String motivo;
    private EstadoCita estado;
    private BigDecimal tarifaAplicada;
}
