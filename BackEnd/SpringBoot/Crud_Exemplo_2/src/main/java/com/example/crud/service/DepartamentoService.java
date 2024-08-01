package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Departamento;
import com.example.crud.repository.DepartamentoRepository;

@Service
public class DepartamentoService {
    @Autowired
    private DepartamentoRepository departamentoRepository;

    public List<Departamento> getAllDepartamentos(){
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> getDepartamentoById(long numDepto){
        return departamentoRepository.findById(numDepto);
    }

    public Departamento saveDepartamento(Departamento departamento){
        return departamentoRepository.save(departamento);
    }

    public void deleteDepartamento(long numDepto){
        departamentoRepository.deleteById(numDepto);
    }
}
