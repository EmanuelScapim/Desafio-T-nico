package io.github.emanuelscapim.desafiotecnico.services;

import io.github.emanuelscapim.desafiotecnico.entities.BombasdeCombustivel;
import io.github.emanuelscapim.desafiotecnico.repositories.BombasdeCombustivelRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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
}
