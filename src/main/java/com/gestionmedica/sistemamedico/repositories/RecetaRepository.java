package com.gestionmedica.sistemamedico.repositories;

import com.gestionmedica.sistemamedico.entities.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaRepository extends JpaRepository<Receta, Long> {
}
