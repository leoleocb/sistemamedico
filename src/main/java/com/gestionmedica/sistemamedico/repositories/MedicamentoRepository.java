package com.gestionmedica.sistemamedico.repositories;

import com.gestionmedica.sistemamedico.entities.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
    Optional<Medicamento> findByNombre(String nombre);
}
