package com.gestionmedica.sistemamedico.repositories;

import com.gestionmedica.sistemamedico.entities.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnfermedadRepository extends JpaRepository<Enfermedad, Long> {
}
