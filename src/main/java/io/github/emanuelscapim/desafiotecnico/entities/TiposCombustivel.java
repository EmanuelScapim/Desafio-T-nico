package io.github.emanuelscapim.desafiotecnico.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_tiposcombustivel")
public class TiposCombustivel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private Double preco;

    public TiposCombustivel() {
    }

    public TiposCombustivel(String nome, Double preco, UUID id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
