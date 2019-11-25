package com.project.santak.controller;

import com.project.santak.model.Produto;
import com.project.santak.repository.ProdutosRepository;
import com.project.santak.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProdutosController {

    @Autowired
    private ProdutosRepository pig;

    @Autowired
    private ProdutoService proService;

    @RequestMapping(value="/cadastrarProduto", method=RequestMethod.GET)
    public ModelAndView formProduto(){
        Produto produto = new Produto();

        ModelAndView mv = new ModelAndView("formProduto");
        mv.addObject("produto", produto);
        return mv;
    }

    @RequestMapping(value="/salvarProduto", method=RequestMethod.POST)
    public String salvarProduto(@ModelAttribute("produto") Produto produto){
        proService.save(produto);

        return "redirect:/produtos";
    }

    @RequestMapping(value="/produtos")
    public ModelAndView listaProduto(){
        ModelAndView mv = new ModelAndView("produtos");
        List<Produto> produto = proService.listAll();
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

    @RequestMapping(value = "/editarProduto/{id}", method = RequestMethod.GET)
    public ModelAndView getProduto(@PathVariable(name = "id") Long id){
        Produto produto = proService.get(id);

        ModelAndView mv = new ModelAndView("editarProduto");
        mv.addObject("produto", produto);
        return mv;
        //return formProduto(proService.findOne(id));
    }

    @RequestMapping(value = "/deletar_produto")
    public String deletarProduto(Long id){
        proService.delete(id);
        return "redirect:/produtos";
    }

    @RequestMapping(value="/pesquisarProduto", method= RequestMethod.POST)
    public ModelAndView pesquisarProduto(@RequestParam("nomep") String nomep){
        ModelAndView mv = new ModelAndView("index");
        List<Produto> produto = pig.findProdutoByCor(nomep);
        mv.addObject("produtos", produto);

        return mv;
    }

}