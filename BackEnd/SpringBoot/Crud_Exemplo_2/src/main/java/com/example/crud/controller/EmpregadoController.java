package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.crud.model.Empregado;
import com.example.crud.service.EmpregadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/empregados")
public class EmpregadoController {
    @Autowired
    private EmpregadoService empregadoService;

    @GetMapping
    public String getAllEmpregados(Model model) {
        List<Empregado> empregados = empregadoService.getAllEmpregados();
        model.addAttribute("empregados", empregados);
        return "empregado/list";
    }

    @GetMapping("/novo")
    public String showForm(Empregado empregado){
        return "empregado/form";
    }

    @PostMapping
    public String saveEmpregado(@ModelAttribute Empregado empregado){
        empregadoService.saveEmpregado(empregado);
        return "redirect:/empregados";
    }

    @GetMapping("editar/{matricula}")
    public String showUpdateForm(@PathVariable("matricula") Long matricula, Model model){
        Empregado empregado = empregadoService.getEmpregadoById(matricula).orElseThrow(() -> new IllegalArgumentException("Matricula do empregado inválida: " + matricula));
        model.addAttribute("empregado", empregado);
        return "empregado/form";
    }

    @GetMapping("/deletar/{matricula}")
    public String deleteEmpregado(@PathVariable("matricula") Long matricula){
        empregadoService.deleteEmpregado(matricula);
        return "redirect:/empregados";
    }
    
}
