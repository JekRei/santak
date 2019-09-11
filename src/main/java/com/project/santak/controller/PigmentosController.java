package com.project.santak.controller;

import com.project.santak.model.Pigmentos;
import com.project.santak.repository.PigmentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PigmentosController {

    @Autowired
    PigmentosRepository pig;

    @RequestMapping(value="/cadastrarPigmento", method=RequestMethod.GET)
    public String formPigmento(){
        return "formPigmento";
    }

    @RequestMapping(value="/cadastrarPigmento", method=RequestMethod.POST)
    public String formPigmento(@RequestParam String nome, @RequestParam String cod, @RequestParam String marca, @RequestParam String produto, @RequestParam String medida){

        Pigmentos pigmento = new Pigmentos();
        pigmento.setPNome(nome);
        pigmento.setPCod(cod);
        pigmento.setPMarca(marca);
        pigmento.setPProduto(produto);
        pigmento.setPMedida(medida);
        pig.save(pigmento);

        return "redirect:/cadastrarPigmento";
    }

    @RequestMapping(value="/pigmentos")
    public ModelAndView listaPigmentos(){
        ModelAndView mv = new ModelAndView("pigmentos");
        Iterable<Pigmentos> pigmento = pig.findAll();
        mv.addObject("pigmentos", pigmento);

        return mv;
    }
}