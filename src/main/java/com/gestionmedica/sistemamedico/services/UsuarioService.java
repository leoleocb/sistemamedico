package com.gestionmedica.sistemamedico.services;

import com.gestionmedica.sistemamedico.dtos.UsuarioDTO;
import com.gestionmedica.sistemamedico.entities.Usuario;

import java.util.Optional;

public interface UsuarioService {
    Usuario guardarUsuarioConRolPaciente(UsuarioDTO usuarioDTO);
    Optional<Usuario> buscarPorEmail(String email);
}
