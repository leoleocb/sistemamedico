package com.gestionmedica.sistemamedico.repositories;

import com.gestionmedica.sistemamedico.entities.HorarioAtencion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioAtencionRepository extends JpaRepository<HorarioAtencion, Long> {
}
