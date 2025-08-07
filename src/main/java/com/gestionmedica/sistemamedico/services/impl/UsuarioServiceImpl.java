package com.gestionmedica.sistemamedico.services.impl;

import com.gestionmedica.sistemamedico.dtos.UsuarioDTO;
import com.gestionmedica.sistemamedico.entities.Role;
import com.gestionmedica.sistemamedico.entities.Usuario;
import com.gestionmedica.sistemamedico.repositories.RoleRepository;
import com.gestionmedica.sistemamedico.repositories.UsuarioRepository;
import com.gestionmedica.sistemamedico.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Usuario guardarUsuarioConRolPaciente(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setName(usuarioDTO.getName());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setPassword(passwordEncoder.encode(usuarioDTO.getPassword()));

        // crear los roles si no existen
        Role rolPaciente = roleRepository.findByName("ROLE_PACIENTE")
                .orElseGet(() -> roleRepository.save(new Role(null, "ROLE_PACIENTE")));

        usuario.setRoles(Collections.singleton(rolPaciente));
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
}
