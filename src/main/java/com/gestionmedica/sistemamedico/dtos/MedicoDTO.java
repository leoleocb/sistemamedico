package com.gestionmedica.sistemamedico.dtos;

import com.gestionmedica.sistemamedico.enums.Enums.Especialidad;
import com.gestionmedica.sistemamedico.enums.Enums.EstadoDoctor;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedicoDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String numeroLicencia;
    private String telefono;
    private String email;
    private Especialidad especialidad;
    private EstadoDoctor estado;
    private boolean disponible;
    private BigDecimal tarifaConsulta;
}
