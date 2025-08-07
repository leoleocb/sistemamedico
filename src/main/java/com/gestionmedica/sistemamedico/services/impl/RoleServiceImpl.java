package com.gestionmedica.sistemamedico.services.impl;

import com.gestionmedica.sistemamedico.entities.Role;
import com.gestionmedica.sistemamedico.repositories.RoleRepository;
import com.gestionmedica.sistemamedico.services.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Optional<Role> buscarPorNombre(String nombre) {
        return roleRepository.findByName(nombre);
    }
}
