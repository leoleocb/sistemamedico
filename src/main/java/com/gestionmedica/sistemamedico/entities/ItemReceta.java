package com.gestionmedica.sistemamedico.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "items_receta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemReceta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dosis;

    private String frecuencia;

    @ManyToOne
    private Receta receta;

    @ManyToOne
    private Medicamento medicamento;
}
