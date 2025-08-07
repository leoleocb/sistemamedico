package com.gestionmedica.sistemamedico.repositories;

import com.gestionmedica.sistemamedico.entities.ExpedienteMedico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpedienteMedicoRepository extends JpaRepository<ExpedienteMedico, Long> {
}
