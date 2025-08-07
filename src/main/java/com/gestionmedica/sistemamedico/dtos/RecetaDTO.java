package com.gestionmedica.sistemamedico.dtos;

import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecetaDTO {
    private Long id;
    private LocalDate fechaEmision;
    private LocalDate fechaCaducidad;
    private Long pacienteId;
    private Long medicoId;
    private List<ItemRecetaDTO> items;
}
