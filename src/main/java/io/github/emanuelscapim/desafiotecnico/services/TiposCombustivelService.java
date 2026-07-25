package io.github.emanuelscapim.desafiotecnico.services;

import io.github.emanuelscapim.desafiotecnico.entities.TiposCombustivel;
import io.github.emanuelscapim.desafiotecnico.repositories.TiposCombustivelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TiposCombustivelService {

    TiposCombustivelRepository repository;

    TiposCombustivelService(TiposCombustivelRepository repository){
        this.repository = repository;
    }

    public List<TiposCombustivel> findAll(){
        return repository.findAll();
    }

    public TiposCombustivel insert(TiposCombustivel combustivel){
        return repository.save(combustivel);
    }

    public void delete(UUID id){
        repository.deleteById(id);
    }

    public void alterar(UUID id, TiposCombustivel combustivel){
        TiposCombustivel entity = repository.getReferenceById(id);
        atualizaDados(entity, combustivel);
        repository.save(entity);
    }


    public void atualizaDados(TiposCombustivel entity, TiposCombustivel combustivel){
        entity.setNome(combustivel.getNome());
        entity.setPreco(combustivel.getPreco());
    }
}
