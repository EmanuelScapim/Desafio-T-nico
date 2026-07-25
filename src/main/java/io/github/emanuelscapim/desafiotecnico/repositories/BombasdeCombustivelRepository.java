package io.github.emanuelscapim.desafiotecnico.repositories;

import io.github.emanuelscapim.desafiotecnico.entities.BombasdeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BombasdeCombustivelRepository extends JpaRepository<BombasdeCombustivel, UUID> {
}
