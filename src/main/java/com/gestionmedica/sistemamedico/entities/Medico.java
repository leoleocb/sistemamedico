package com.gestionmedica.sistemamedico.entities;

import com.gestionmedica.sistemamedico.enums.Enums.Especialidad;
import com.gestionmedica.sistemamedico.enums.Enums.EstadoDoctor;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "medicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false, unique = true)
    private String numeroLicencia;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;

    @Enumerated(EnumType.STRING)
    private EstadoDoctor estado;

    @Column(nullable = false)
    private boolean disponible;

    @Column(nullable = false)
    private BigDecimal tarifaConsulta;

    @OneToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    private List<HorarioAtencion> horarios;
}
