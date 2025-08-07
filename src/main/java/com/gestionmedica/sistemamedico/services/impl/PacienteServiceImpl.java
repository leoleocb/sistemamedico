package com.gestionmedica.sistemamedico.services.impl;

import com.gestionmedica.sistemamedico.dtos.PacienteDTO;
import com.gestionmedica.sistemamedico.entities.Paciente;
import com.gestionmedica.sistemamedico.repositories.PacienteRepository;
import com.gestionmedica.sistemamedico.services.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PacienteServiceImpl implements PacienteService {

    private final PacienteRepository pacienteRepository;

    @Override
    public Paciente registrarPaciente(PacienteDTO pacienteDTO) {
        Paciente paciente = new Paciente();
        paciente.setNombre(pacienteDTO.getNombre());
        paciente.setNumeroIdentificacion(pacienteDTO.getNumeroIdentificacion());
        paciente.setFechaNacimiento(pacienteDTO.getFechaNacimiento());
        paciente.setUsuario(pacienteDTO.getUsuario());
        return pacienteRepository.save(paciente);
    }
}
