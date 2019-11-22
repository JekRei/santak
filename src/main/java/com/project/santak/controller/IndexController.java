package com.project.santak.controller;

import com.project.santak.model.Produto;
import com.project.santak.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    ProdutosRepository pig;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value="/", method= RequestMethod.POST)
    public ModelAndView listaProduto(@RequestParam String search){
        System.out.println("teste 1");
        ModelAndView mv = new ModelAndView("index");
        Iterable<Produto> produtos = pig.findByName(search);
        mv.addObject("index", produtos);

        System.out.println("teste 4");
        return mv;
    }
}
