package com.uva.ia.motordeinferencia.controllers;

import com.uva.ia.motordeinferencia.questoes.Item;
import com.uva.ia.motordeinferencia.questoes.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/itens")
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping
    public Iterable<Item> listarTodas() {
        return itemRepository.findAll();
    }

    @GetMapping(value = "/item/{id}")
    public Item listarTodas(@PathVariable("id") long id) {
        return itemRepository.findById(id);
    }

    @PostMapping(value = "/add")
    public Item salva(@Valid @RequestBody Item item) {
        return itemRepository.save(item);
    }

    @PostMapping(value = "/add/grupo")
    public List<Item> salvaGrupo(@Valid @RequestBody List<Item> itens) {
        return itemRepository.saveAll(itens);
    }

}
