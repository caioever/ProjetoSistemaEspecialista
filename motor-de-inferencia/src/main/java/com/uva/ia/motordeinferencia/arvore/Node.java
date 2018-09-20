package com.uva.ia.motordeinferencia.arvore;

import com.uva.ia.motordeinferencia.questoes.Item;
import com.uva.ia.motordeinferencia.questoes.Pergunta;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Optional;

@Entity
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "node_id")
    private long nodeId;
    private boolean terminal;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "pergunta_id")
    private Pergunta pergunta;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "resp_sim")
    private Node respSim;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "resp_nao")
    private Node respNao;

    public long getNodeId() {
        return nodeId;
    }

    public void setNodeId(long id) {
        this.nodeId = id;
    }

    @Nullable
    public Optional<Pergunta> getPergunta() {
        return Optional.ofNullable(pergunta);
    }

    public void setPergunta(@Nullable Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    @Nullable
    public Optional<Item> getItem() {
        return Optional.ofNullable(item);
    }

    public void setItem(@Nullable Item item) {
        this.item = item;
    }

    public boolean isTerminal() {
        return terminal;
    }

    public void setTerminal(boolean terminal) {
        this.terminal = terminal;
    }

    @Nullable
    public Optional<Node> getRespSim() {
        return Optional.ofNullable(respSim);
    }

    public void setRespSim(@Nullable Node respSim) {
        this.respSim = respSim;
    }

    @Nullable
    public Optional<Node> getRespNao() {
        return Optional.ofNullable(respNao);
    }

    public void setRespNao(@Nullable Node respNao) {
        this.respNao = respNao;
    }
}
