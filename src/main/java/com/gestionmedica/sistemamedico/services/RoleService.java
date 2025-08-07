package com.gestionmedica.sistemamedico.services;

import com.gestionmedica.sistemamedico.entities.Role;

import java.util.Optional;

public interface RoleService {
    Optional<Role> buscarPorNombre(String nombre);
}
