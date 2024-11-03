package org.lucashspring3.curso.demomvc.curso.web.controller;

import org.lucashspring3.curso.demomvc.curso.entity.Departamento;
import org.lucashspring3.curso.demomvc.curso.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    DepartamentoService departamentoService;

    @GetMapping("/cadastrar")
    public String cadastro(Model model) {
        model.addAttribute("departamento", new Departamento());
     return "/departamento/cadastro";
        
    }


    @GetMapping("/listar")
    public String listar() {
        return "/departamento/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Departamento departamento) {
        departamentoService.salvar(departamento);
        return "redirect:/departamentos/cadastrar";
    }


}
