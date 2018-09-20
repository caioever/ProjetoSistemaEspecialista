package com.uva.ia.interfacefrontend.controllers;

import com.uva.ia.interfacefrontend.model.PerguntaDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PerguntasController {

    @RequestMapping(value = "/perguntas")
    public ModelAndView listaPerguntas() {
        ModelAndView mv = new ModelAndView("lista");

        RestTemplate restTemplate = new RestTemplate();
        PerguntaDTO[] perguntaDTO = restTemplate.getForObject("http://localhost:5000/perguntas", PerguntaDTO[].class);

        mv.addObject("resposta", perguntaDTO);
        mv.addObject("tipo", "perguntas");
        return mv;
    }
}
