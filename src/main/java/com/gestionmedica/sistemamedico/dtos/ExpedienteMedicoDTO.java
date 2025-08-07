package com.gestionmedica.sistemamedico.dtos;

import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpedienteMedicoDTO {
    private Long id;
    private Long pacienteId;
    private List<EntradaHistorialDTO> entradas;
}
