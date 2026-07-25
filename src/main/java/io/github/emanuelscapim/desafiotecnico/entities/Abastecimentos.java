package io.github.emanuelscapim.desafiotecnico.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "tb_abastecimento")
public class Abastecimentos {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant datadoabastecimento;
    private Double litragem;

    public Abastecimentos() {
    }

    public Abastecimentos(UUID id, Instant datadoabastecimento, Double litragem) {
        this.id = id;
        this.datadoabastecimento = datadoabastecimento;
        this.litragem = litragem;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Instant getDatadoabastecimento() {
        return datadoabastecimento;
    }

    public void setDatadoabastecimento(Instant datadoabastecimento) {
        this.datadoabastecimento = datadoabastecimento;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }
}
