package com.project.santak.controller;

import com.project.santak.model.Pigmentos;
import com.project.santak.repository.PigmentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PigmentosController {

    @Autowired
    PigmentosRepository pig;

    @RequestMapping(value="/cadastrarPigmento", method=RequestMethod.GET)
    public String formPigmento(){
        return "formPigmento";
    }

    @RequestMapping(value="/cadastrarPigmento", method=RequestMethod.POST)
    public @ResponseBody String formPigmento(@RequestParam String nome, @RequestParam String cod, @RequestParam String marca, @RequestParam String produto, @RequestParam String medida){

        Pigmentos pigmento = new Pigmentos();
        pigmento.setPNome(nome);
        pigmento.setPCod(cod);
        pigmento.setPMarca(marca);
        pigmento.setPProduto(produto);
        pigmento.setPMedida(medida);
        pig.save(pigmento);

        return "cadastrarPigmento";
    }
}
