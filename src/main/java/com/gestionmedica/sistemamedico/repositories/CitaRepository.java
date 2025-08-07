package com.gestionmedica.sistemamedico.repositories;

import com.gestionmedica.sistemamedico.entities.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface CitaRepository extends JpaRepository<Cita, Long> {
    List<Cita> findByPacienteIdAndFecha(Long pacienteId, LocalDate fecha);
    boolean existsByMedicoIdAndFechaAndHora(Long medicoId, LocalDate fecha, LocalTime hora);
}
