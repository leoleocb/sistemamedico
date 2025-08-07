package com.gestionmedica.sistemamedico.config;

import com.gestionmedica.sistemamedico.entities.Role;
import com.gestionmedica.sistemamedico.repositories.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RoleInitializer {

    @Bean
    public CommandLineRunner initRoles(RoleRepository roleRepository) {
        return args -> {
            List<String> roles = List.of("ROLE_ADMIN", "ROLE_MEDICO", "ROLE_PACIENTE");

            for (String roleName : roles) {
                roleRepository.findByName(roleName)
                    .orElseGet(() -> roleRepository.save(new Role(null, roleName)));
            }

            System.out.println("✅ Roles verificados o creados correctamente.");
        };
    }
}
