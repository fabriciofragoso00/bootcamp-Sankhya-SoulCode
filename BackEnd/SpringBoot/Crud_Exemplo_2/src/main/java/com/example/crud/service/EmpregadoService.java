package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.repository.EmpregadoRepository;
import com.example.crud.model.Empregado;

@Service
public class EmpregadoService {
    @Autowired
    private EmpregadoRepository empregadoRepository;

    public List<Empregado> getAllEmpregados(){
        return empregadoRepository.findAll();
    }

    public Optional<Empregado> getEmpregadoById(long matricula){
        return empregadoRepository.findById(matricula);
    }

    public Empregado saveEmpregado(Empregado empregado){
        return empregadoRepository.save(empregado);
    }

    public void deleteEmpregado(Long matricula){
        empregadoRepository.deleteById(matricula);
    }
}
