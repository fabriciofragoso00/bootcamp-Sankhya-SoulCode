package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.crud.model.Departamento;
import com.example.crud.service.DepartamentoService;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping
    public String getAllDepartamentos(Model model){
        List<Departamento> departamentos = departamentoService.getAllDepartamentos();
        model.addAttribute("departamentos", departamentos);
        return "departamento/list";
    }

    @GetMapping("/novo")
    public String showForm(Departamento departamento){
        return "departamento/form";
    }

    @PostMapping
    public String saveDepartamento(@ModelAttribute Departamento departamento){
        departamentoService.saveDepartamento(departamento);
        return "redirect:/departamentos";
    }

    @GetMapping("editar/{numDepto}")
    public String showUpdateForm(@PathVariable("numDepto") Long numDepto, Model model){
        Departamento departamento = departamentoService.getDepartamentoById(numDepto).orElseThrow(() -> new IllegalArgumentException("Número do departamento é inválido: " + numDepto));
        model.addAttribute("departamento", departamento);
        return "departamento/form";
    }

    @GetMapping("/deletar/{numDepto}")
    public String deleteDepartamento(@PathVariable("numDepto") Long numDepto){
        departamentoService.deleteDepartamento(numDepto);
        return"redirect:/departamentos";
    }
}
