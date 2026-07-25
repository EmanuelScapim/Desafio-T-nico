package io.github.emanuelscapim.desafiotecnico.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_bombasdecombustivel")
public class BombasdeCombustivel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer numerodabomba;
    private String combustivel;

    public BombasdeCombustivel() {
    }

    public BombasdeCombustivel(UUID id, Integer numerodabomba, String combustivel) {
        this.id = id;
        this.numerodabomba = numerodabomba;
        this.combustivel = combustivel;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getNumerodabomba() {
        return numerodabomba;
    }

    public void setNumerodabomba(Integer numerodabomba) {
        this.numerodabomba = numerodabomba;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
