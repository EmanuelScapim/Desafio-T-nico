package io.github.emanuelscapim.desafiotecnico.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_bombasdecombustivel")
public class BombasdeCombustivel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer numerodabomba;

    @ManyToOne
    @JoinColumn(name = "combustivel_id")
    TiposCombustivel tiposCombustivel;

    @OneToMany(mappedBy = "bomba")
    Set<Abastecimentos> abastecimentos = new HashSet<>();

    public BombasdeCombustivel() {
    }

    public BombasdeCombustivel(UUID id, Integer numerodabomba, TiposCombustivel tiposCombustivel) {
        this.id = id;
        this.numerodabomba = numerodabomba;
        this.tiposCombustivel = tiposCombustivel;
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

    public TiposCombustivel getTiposCombustivel() {
        return tiposCombustivel;
    }

    public void setTiposCombustivel(TiposCombustivel tiposCombustivel) {
        this.tiposCombustivel = tiposCombustivel;
    }
}
