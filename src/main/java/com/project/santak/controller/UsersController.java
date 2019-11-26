package com.project.santak.controller;

import com.project.santak.model.Usuario;
import com.project.santak.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String formProduto(){

        return "formLogin";
    }

    @RequestMapping(value = "/registrar", method = RequestMethod.GET)
    public ModelAndView criarConta(){
        Usuario usuario = new Usuario();

        ModelAndView mv = new ModelAndView("criarConta");
        mv.addObject("usuario", usuario);
        return mv;
    }

    @RequestMapping(value = "/salvarConta", method = RequestMethod.POST)
    public String salvarConta(@ModelAttribute("usuario") Usuario usuario){
        userService.saveUser(usuario);

        return "redirect:/funcionarios";
    }

    @RequestMapping(value = "/updateConta", method = RequestMethod.POST)
    public String updateConta(@ModelAttribute("usuario") Usuario usuario){
        userService.updateUser(usuario);

        return "redirect:/funcionarios";
    }

    @RequestMapping(value = "/funcionarios")
    public ModelAndView listaPessoa(){
        ModelAndView mv = new ModelAndView("pessoas");
        List<Usuario> usuario = userService.listAll();
        mv.addObject("usuarios", usuario);

        return mv;
    }

    @RequestMapping(value = "/perfil/{id}", method = RequestMethod.GET)
    public ModelAndView perfil(@PathVariable(name = "id") Long id){
        Usuario usuario = userService.get(id);

        ModelAndView mv = new ModelAndView("perfil");
        mv.addObject("usuario", usuario);
        return mv;
    }

    @RequestMapping(value = "/deletar_usuario")
    public String deletarUsuario(Long id){
        userService.delete(id);
        return "redirect:/funcionarios";
    }
}
