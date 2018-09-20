package com.uva.ia.motordeinferencia.questoes;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Pergunta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @NotNull
    private String pergunta;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
}
