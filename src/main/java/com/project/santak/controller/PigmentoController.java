package com.project.santak.controller;

import com.project.santak.repository.PigmentosRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PigmentoController {

    PigmentosRepository pig;

    @RequestMapping(value="/cadastrarPigmento", method= RequestMethod.GET)
    public String formPigmento(){
        return "formPigmento";
    }


}
