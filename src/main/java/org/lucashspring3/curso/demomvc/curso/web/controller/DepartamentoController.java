package org.lucashspring3.curso.demomvc.curso.web.controller;

import org.lucashspring3.curso.demomvc.curso.entity.Departamento;
import org.lucashspring3.curso.demomvc.curso.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    DepartamentoService departamentoService;

    @GetMapping("/cadastrar")
    public String cadastro(@ModelAttribute Departamento departamento, Model model) {
        model.addAttribute("departamento", new Departamento());
//        departamentoService.salvar(departamento);
     return "/departamento/cadastro";
        
    }


    @GetMapping("/listar")
    public String listar(Model model) {
        List<Departamento> departamentos = departamentoService.buscarTodosDepartamentos(); // Certifique-se de que este método retorna a lista correta
        model.addAttribute("departamentos", departamentos);
        return "/departamento/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Departamento departamento) {
        departamentoService.salvar(departamento);
        return "redirect:/departamentos/cadastrar";
    }


}
