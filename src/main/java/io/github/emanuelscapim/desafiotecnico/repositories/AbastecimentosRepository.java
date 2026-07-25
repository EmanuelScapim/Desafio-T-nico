package io.github.emanuelscapim.desafiotecnico.repositories;

import io.github.emanuelscapim.desafiotecnico.entities.Abastecimentos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AbastecimentosRepository extends JpaRepository<Abastecimentos, UUID> {
}
