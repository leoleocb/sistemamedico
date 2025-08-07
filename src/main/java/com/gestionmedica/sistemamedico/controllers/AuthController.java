package com.gestionmedica.sistemamedico.controllers;

import com.gestionmedica.sistemamedico.dtos.UsuarioDTO;
import com.gestionmedica.sistemamedico.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final UsuarioService usuarioService;

    @GetMapping("/login")
    public String login() {
        return "login"; 
    }

   
    @GetMapping("/register")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new UsuarioDTO()); 
        return "register"; 
    }

   
    @PostMapping("/register")
    public String procesarRegistro(@ModelAttribute("usuario") UsuarioDTO usuarioDTO) {
        usuarioService.guardarUsuarioConRolPaciente(usuarioDTO);
        return "redirect:/login?registroExitoso"; 
    }
}
