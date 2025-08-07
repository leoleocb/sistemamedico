package com.gestionmedica.sistemamedico.repositories;

import com.gestionmedica.sistemamedico.entities.ItemReceta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRecetaRepository extends JpaRepository<ItemReceta, Long> {
}
