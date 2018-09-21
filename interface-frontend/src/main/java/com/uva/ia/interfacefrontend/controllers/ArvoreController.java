package com.uva.ia.interfacefrontend.controllers;

import com.uva.ia.interfacefrontend.model.NodeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArvoreController {

//    @RequestMapping(value = "/arvore")
//    public ModelAndView printArvore() {
//        ModelAndView mv = new ModelAndView("arvore");
//
//        RestTemplate restTemplate = new RestTemplate();
//        NodeDTO nodeDTO = restTemplate.getForObject("http://localhost:5000/arvore", NodeDTO.class);
//
//        mv.addObject("arvore", nodeDTO);
//        return mv;
//    }
    @RequestMapping(value = "/arvore")
    public String printArvore() {
        return "arvore";
    }

    @RequestMapping(value = "/init")
    public ModelAndView init() {
        RestTemplate restTemplate = new RestTemplate();
        NodeDTO nodeDTO = restTemplate.getForObject("http://localhost:5000/arvore/no/1", NodeDTO.class);

        ModelAndView mv = new ModelAndView("game");
        mv.addObject("no", nodeDTO);
        return mv;
    }

    @RequestMapping(value = "/arvore/proximo/{nodeId}")
    public ModelAndView percorre(@PathVariable("nodeId") int nodeId) {
        String urlBuilder = "http://localhost:5000/arvore/no/" + nodeId;
        RestTemplate restTemplate = new RestTemplate();
        NodeDTO nodeDTO = restTemplate.getForObject(urlBuilder, NodeDTO.class);

        if(nodeDTO.isTerminal()) {
            ModelAndView mv = new ModelAndView("terminal");
            mv.addObject("no", nodeDTO);
            return mv;
        }

        ModelAndView mv = new ModelAndView("game");
        mv.addObject("no", nodeDTO);
        return mv;
    }
}
