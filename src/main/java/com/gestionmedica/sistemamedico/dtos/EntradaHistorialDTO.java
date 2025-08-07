package com.gestionmedica.sistemamedico.dtos;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntradaHistorialDTO {
    private Long id;
    private LocalDateTime fechaHora;
    private String diagnostico;
    private String tratamiento;
}
