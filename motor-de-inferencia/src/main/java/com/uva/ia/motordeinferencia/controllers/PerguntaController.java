package com.uva.ia.motordeinferencia.controllers;

import com.uva.ia.motordeinferencia.questoes.Pergunta;
import com.uva.ia.motordeinferencia.questoes.repository.PerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/perguntas")
public class PerguntaController {

    @Autowired
    PerguntaRepository perguntaRepository;

    @GetMapping
    public Iterable<Pergunta> listarTodas() {
        return perguntaRepository.findAll();
    }

    @GetMapping(value = "/pergunta/{id}")
    public Pergunta listarTodas(@PathVariable("id") long id) { return perguntaRepository.findById(id); }

    @PostMapping(value = "/add")
    public Pergunta salva(@Valid @RequestBody Pergunta pergunta) {
        return perguntaRepository.save(pergunta);
    }

    @PostMapping(value = "/add/grupo")
    public List<Pergunta> salvaGrupo(@Valid @RequestBody List<Pergunta> perguntas) {
        return perguntaRepository.saveAll(perguntas);
    }

}
