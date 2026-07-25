package io.github.emanuelscapim.desafiotecnico.repositories;

import io.github.emanuelscapim.desafiotecnico.entities.TiposCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TiposCombustivelRepository extends JpaRepository <TiposCombustivel, UUID>{
}
