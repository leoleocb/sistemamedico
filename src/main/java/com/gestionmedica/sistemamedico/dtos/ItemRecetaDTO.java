package com.gestionmedica.sistemamedico.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemRecetaDTO {
    private Long id;
    private Long medicamentoId;
    private String dosis;
    private String frecuencia;
}
