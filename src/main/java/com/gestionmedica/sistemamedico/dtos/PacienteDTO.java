package com.gestionmedica.sistemamedico.dtos;

import com.gestionmedica.sistemamedico.entities.Usuario;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PacienteDTO {
    private Long id;
    private String nombre;
    private String numeroIdentificacion;
    private LocalDate fechaNacimiento;
    private Usuario usuario; 
}
