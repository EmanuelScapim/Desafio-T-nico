package io.github.emanuelscapim.desafiotecnico.resources;

import io.github.emanuelscapim.desafiotecnico.entities.Abastecimentos;
import io.github.emanuelscapim.desafiotecnico.services.AbastecimentosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("abastecimento")
public class AbastecimentosResource {

    AbastecimentosService service;

    AbastecimentosResource(AbastecimentosService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Abastecimentos> salvar(@RequestBody Abastecimentos abastecimento){
        service.inserir(abastecimento);
        return ResponseEntity.ok().body(abastecimento);
    }

    @GetMapping
    public ResponseEntity<List<Abastecimentos>> findAll(){
       List<Abastecimentos> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable UUID id){
        service.delete(id);
    }

    @PutMapping("{id}")
    public void altera(@RequestBody Abastecimentos abastecimentos, @PathVariable UUID id){
        service.alterarDados(id, abastecimentos);
    }
}
