package com.gestionmedica.sistemamedico.dtos;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDTO {
    private Long id;
    private String name;
    private String email;
    private Set<String> roles;
}
