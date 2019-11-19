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
    public String formProduto(@RequestParam String cor, @RequestParam String cod, @RequestParam String marca, @RequestParam int material, @RequestParam String medida, @RequestParam String red, @RequestParam String yellow, @RequestParam String blue, @RequestParam String ocre, @RequestParam String black, @RequestParam String rust_red, @RequestParam String green){

        Produto produto = new Produto();
        produto.setCor(cor);
        produto.setCod(cod);
        produto.setMarca(marca);
        produto.setMaterial_id(material);
        produto.setMedida(medida);

        produto.setRed(red);
        produto.setYellow(yellow);
        produto.setBlue(blue);
        produto.setOcre(ocre);
        produto.setBlack(black);
        produto.setRust_red(rust_red);
        produto.setGreen(green);

        produto.setUser_id(0);
        pig.save(produto);

        return "redirect:/cadastrarProduto";
    }

    @RequestMapping(value="/produtos")
    public ModelAndView listaProduto(){
        ModelAndView mv = new ModelAndView("produtos");
        Iterable<Produto> produto = pig.findAll();
        mv.addObject("produtos", produto);

        return mv;
    }

    @RequestMapping(value = "/{id}")
    public ModelAndView detalhesProduto(@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("detalhesProduto");
        Produto produto = pig.findById(id);
        mv.addObject("produto", produto);

        return mv;
    }

    @RequestMapping(value = "/deletar")
    public String deletarProduto(long id){
        Produto produto = pig.findById(id);
        pig.delete(produto);
        return "redirect:/produtos";
    }
}