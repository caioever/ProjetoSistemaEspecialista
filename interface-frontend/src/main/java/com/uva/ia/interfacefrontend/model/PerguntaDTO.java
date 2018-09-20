package com.uva.ia.interfacefrontend.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.io.Serializable;

public class PerguntaDTO implements Serializable {
    private int id;

    @JsonAlias(value = "pergunta")
    private String label;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
