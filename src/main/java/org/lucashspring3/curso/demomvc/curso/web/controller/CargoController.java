package org.lucashspring3.curso.demomvc.curso.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargoController {

    @GetMapping("/cadastrar")
    private String cadastrarCargo() {
        return "cargo/cadastro";
    }

    @GetMapping("/listar")
    private String listarCargo() {
        return "cargo/lista";
    }
}
