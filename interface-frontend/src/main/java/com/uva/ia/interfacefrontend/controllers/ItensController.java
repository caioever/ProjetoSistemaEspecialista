package com.uva.ia.interfacefrontend.controllers;

import com.uva.ia.interfacefrontend.model.ItemDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ItensController {

    @RequestMapping(value = "/itens")
    public ModelAndView listaItens() {
        ModelAndView mv = new ModelAndView("lista");

        RestTemplate restTemplate = new RestTemplate();
        ItemDTO[] itemDTO = restTemplate.getForObject("http://localhost:5000/itens", ItemDTO[].class);

        mv.addObject("resposta", itemDTO);
        mv.addObject("tipo", "itens");
        return mv;
    }
}
