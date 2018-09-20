package com.uva.ia.motordeinferencia.questoes.repository;

import com.uva.ia.motordeinferencia.questoes.Pergunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {
    List<Pergunta> findAll();
    Pergunta findById(long id);
}
