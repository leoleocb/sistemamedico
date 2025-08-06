package com.gestionmedica.sistemamedico.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "expedientes_medicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpedienteMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Paciente paciente;

    @OneToMany(mappedBy = "expediente", cascade = CascadeType.ALL)
    private List<EntradaHistorial> entradas;
}
