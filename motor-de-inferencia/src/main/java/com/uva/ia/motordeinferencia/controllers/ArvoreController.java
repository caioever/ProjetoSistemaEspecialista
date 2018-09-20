package com.uva.ia.motordeinferencia.controllers;

import com.uva.ia.motordeinferencia.arvore.Node;
import com.uva.ia.motordeinferencia.arvore.repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value =  "/arvore")
public class ArvoreController {

    @Autowired
    NodeRepository nodeRepository;

    @GetMapping
    public Node printTree() {
        return nodeRepository.findById(1);
    }

    @GetMapping(value = "/no/{idDoNo}")
    public Node printNode(@PathVariable("idDoNo") long id) {
        return nodeRepository.findById(id);
    }
}
