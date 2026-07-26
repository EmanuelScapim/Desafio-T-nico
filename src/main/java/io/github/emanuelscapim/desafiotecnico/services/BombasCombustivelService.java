package io.github.emanuelscapim.desafiotecnico.services;

import io.github.emanuelscapim.desafiotecnico.entities.BombasdeCombustivel;
import io.github.emanuelscapim.desafiotecnico.repositories.BombasdeCombustivelRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@Service
public class BombasCombustivelService {

    private BombasdeCombustivelRepository repository;

    BombasCombustivelService(BombasdeCombustivelRepository repository){
        this.repository = repository;
    }

    public void inserir(BombasdeCombustivel bomba){
        repository.save(bomba);
    }

    public List<BombasdeCombustivel> findAll(){
        return repository.findAll();
    }

    public void delete(UUID id){
         repository.deleteById(id);
    }

    public void atualizar(UUID id, BombasdeCombustivel bomba){
        BombasdeCombustivel entity = repository.getReferenceById(id);
        atualizarDados(entity, bomba);
        repository.save(entity);
    }

    public void atualizarDados(BombasdeCombustivel entity, BombasdeCombustivel bomba){
        entity.setNumerodabomba(bomba.getNumerodabomba());
        entity.setTiposCombustivel(bomba.getTiposCombustivel());
    }
}
