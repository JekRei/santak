package com.project.santak.controller;

import com.project.santak.model.Produtos;
import com.project.santak.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProdutosController {

    @Autowired
    ProdutosRepository pig;

    @RequestMapping(value="/cadastrarProduto", method=RequestMethod.GET)
    public String formProduto(){
        return "formProduto";
    }

    @RequestMapping(value="/cadastrarProduto", method=RequestMethod.POST)
    public String formProduto(@RequestParam String nome, @RequestParam String cod, @RequestParam String marca, @RequestParam String material, @RequestParam String medida){

        Produtos produto = new Produtos();
        produto.setPNome(nome);
        produto.setPCod(cod);
        produto.setPMarca(marca);
        produto.setPMaterial(material);
        produto.setPMedida(medida);
        pig.save(produto);

        return "redirect:/cadastrarProduto";
    }

    @RequestMapping(value="/produtos")
    public ModelAndView listaPigmentos(){
        ModelAndView mv = new ModelAndView("produtos");
        Iterable<Produtos> produto = pig.findAll();
        mv.addObject("produtos", produto);

        return mv;
    }
}