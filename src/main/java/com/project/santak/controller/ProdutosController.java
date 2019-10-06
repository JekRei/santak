package com.project.santak.controller;

import com.project.santak.model.Produto;
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

        Produto produto = new Produto();
        produto.setnome(nome);
        produto.setcod(cod);
        produto.setmarca(marca);
        pig.save(produto);

        return "redirect:/cadastrarProduto";
    }

    @RequestMapping(value="/Produtos")
    public ModelAndView listaProduto(){
        ModelAndView mv = new ModelAndView("produtos");
        Iterable<Produto> produto = pig.findAll();
        mv.addObject("produtos", produto);

        return mv;
    }
}