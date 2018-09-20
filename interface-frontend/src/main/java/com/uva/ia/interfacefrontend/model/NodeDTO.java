package com.uva.ia.interfacefrontend.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.io.Serializable;
import java.util.Optional;

public class NodeDTO implements Serializable {
    private int nodeId;
    private boolean terminal;
    private Optional<PerguntaDTO> pergunta;
    private Optional<ItemDTO> item;

    @JsonAlias(value = "respSim")
    private NodeDTO sim;

    @JsonAlias(value = "respNao")
    private NodeDTO nao;

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public boolean isTerminal() {
        return terminal;
    }

    public void setTerminal(boolean terminal) {
        this.terminal = terminal;
    }

    public Optional<PerguntaDTO> getPergunta() {
        return pergunta;
    }

    public void setPergunta(Optional<PerguntaDTO> pergunta) {
        this.pergunta = pergunta;
    }

    public Optional<ItemDTO> getItem() {
        return item;
    }

    public void setItem(Optional<ItemDTO> item) {
        this.item = item;
    }

    public NodeDTO getSim() {
        return sim;
    }

    public void setSim(NodeDTO sim) {
        this.sim = sim;
    }

    public NodeDTO getNao() {
        return nao;
    }

    public void setNao(NodeDTO nao) {
        this.nao = nao;
    }
}
