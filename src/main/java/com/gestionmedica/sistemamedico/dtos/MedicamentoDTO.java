package com.gestionmedica.sistemamedico.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicamentoDTO {
    private Long id;
    private String nombre;
    private String descripcion;
}
