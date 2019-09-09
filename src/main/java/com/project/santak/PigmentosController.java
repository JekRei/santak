package com.project.santak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.naming.Binding;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class PigmentosController {

    @Autowired
    PigmentosRepository pig;

    @RequestMapping(value="/cadastrarPigmento", method=RequestMethod.GET)
    public String formPigmento(){
        return "formPigmento";
    }

    @RequestMapping(value="/cadastrarPigmento", method=RequestMethod.POST)
    public @ResponseBody String formPigmento(@RequestParam String nome, @RequestParam String cod, @RequestParam String marca){

        Pigmentos pigmento = new Pigmentos();
        pigmento.setPNome(nome);
        pigmento.setPCod(cod);
        pigmento.setPMarca(marca);
        pig.save(pigmento);

        return "cadastrarPigmento";
    }
}
