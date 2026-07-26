package io.github.emanuelscapim.desafiotecnico.resources;

import io.github.emanuelscapim.desafiotecnico.entities.BombasdeCombustivel;
import io.github.emanuelscapim.desafiotecnico.services.BombasCombustivelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("bomba")
public class BombasCombustivelResource {

    BombasCombustivelService service;

    BombasCombustivelResource(BombasCombustivelService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<BombasdeCombustivel> inserir(@RequestBody BombasdeCombustivel bomba){
        service.inserir(bomba);
        return ResponseEntity.ok().body(bomba);
    }

    @GetMapping
    public ResponseEntity<List<BombasdeCombustivel>> findAll(){
         List<BombasdeCombustivel> list = service.findAll();
         return ResponseEntity.ok().body(list);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable UUID id){
        service.delete(id);
    }

    @PutMapping("{id}")
    public void atualizar(@RequestBody BombasdeCombustivel bomba, @PathVariable UUID id){
        service.atualizar(id, bomba);
    }
}
