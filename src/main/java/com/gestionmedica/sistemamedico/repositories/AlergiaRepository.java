package com.gestionmedica.sistemamedico.repositories;

import com.gestionmedica.sistemamedico.entities.Alergia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlergiaRepository extends JpaRepository<Alergia, Long> {
}
