package io.github.emanuelscapim.desafiotecnico.services;


import io.github.emanuelscapim.desafiotecnico.entities.Abastecimentos;
import io.github.emanuelscapim.desafiotecnico.entities.BombasdeCombustivel;
import io.github.emanuelscapim.desafiotecnico.repositories.AbastecimentosRepository;
import io.github.emanuelscapim.desafiotecnico.repositories.BombasdeCombustivelRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Service
public class AbastecimentosService {

    AbastecimentosRepository repositoryAbastecimento;
    BombasdeCombustivelRepository repositoryBomba;

    AbastecimentosService(AbastecimentosRepository repositoryAbastecimento, BombasdeCombustivelRepository repositoryBomba){
        this.repositoryAbastecimento = repositoryAbastecimento;
        this.repositoryBomba = repositoryBomba;
    }

    public void inserir(Abastecimentos abastecimento){
        BombasdeCombustivel bombaCompleta = repositoryBomba.getReferenceById(abastecimento.getBomba().getId());
        abastecimento.setBomba(bombaCompleta);

        abastecimento.setDatadoabastecimento(Instant.now());
        abastecimento.somaValor();
        repositoryAbastecimento.save(abastecimento);
    }

    public List<Abastecimentos> findAll(){
        return repositoryAbastecimento.findAll();
    }

    public void delete(UUID id){
        repositoryAbastecimento.deleteById(id);
    }

    public void alterarDados(UUID id, Abastecimentos abastecimentos){
        Abastecimentos entity = repositoryAbastecimento.getReferenceById(id);
        mudaDados(entity, abastecimentos);
        repositoryAbastecimento.save(entity);
    }

    public void mudaDados(Abastecimentos entity, Abastecimentos abastecimentos){
        entity.setLitragem(abastecimentos.getLitragem());
        BombasdeCombustivel bombaCompleta = repositoryBomba.getReferenceById(abastecimentos.getBomba().getId());
        entity.setBomba(bombaCompleta);

        entity.somaValor();
    }
}
