package io.github.emanuelscapim.desafiotecnico.resources;

import io.github.emanuelscapim.desafiotecnico.entities.TiposCombustivel;
import io.github.emanuelscapim.desafiotecnico.services.TiposCombustivelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("combustivel")
public class TiposCombustivelResource {

    TiposCombustivelService service;

    TiposCombustivelResource(TiposCombustivelService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TiposCombustivel>  insert(@RequestBody TiposCombustivel combustivel){
         service.insert(combustivel);
         return ResponseEntity.ok().body(combustivel);
    }

    @GetMapping
    public ResponseEntity<List<TiposCombustivel>> findAll(){
        List<TiposCombustivel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable UUID id){
        service.delete(id);
    }

    @PutMapping(value = "/{id}")
    public void alterar(@PathVariable UUID id, @RequestBody TiposCombustivel combustivel){
        service.alterar(id, combustivel);
    }
}
