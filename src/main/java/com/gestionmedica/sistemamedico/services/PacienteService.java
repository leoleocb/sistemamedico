package com.gestionmedica.sistemamedico.services;

import com.gestionmedica.sistemamedico.dtos.PacienteDTO;
import com.gestionmedica.sistemamedico.entities.Paciente;

public interface PacienteService {
    Paciente registrarPaciente(PacienteDTO pacienteDTO);
}
