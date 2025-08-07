package com.gestionmedica.sistemamedico.repositories;

import com.gestionmedica.sistemamedico.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
