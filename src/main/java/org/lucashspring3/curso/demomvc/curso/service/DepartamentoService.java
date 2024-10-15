package org.lucashspring3.curso.demomvc.curso.service;

import org.lucashspring3.curso.demomvc.curso.Repository.DepartamentoRepository;
import org.lucashspring3.curso.demomvc.curso.entity.Departamento;
import org.lucashspring3.curso.demomvc.curso.exeception.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentoService {

    private final DepartamentoRepository departamentoRepository;

    public DepartamentoService(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    @Transactional(readOnly = false)
    public void salvar(Departamento departamento) {
        departamentoRepository.save(departamento);
    }
    @Transactional(readOnly = false)
    public void editar(Departamento departamento) {
        departamentoRepository.save(departamento);
    }
    @Transactional(readOnly = false)
    public void excluir(Departamento departamento) {
        departamentoRepository.delete(departamento);
    }

    @Transactional(readOnly = true)
    public List<Departamento> buscarTodosDepartamentos() {
        return departamentoRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Departamento buscarPorId(Long id) {
        return departamentoRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Departamento de id " + id + " não encontrado" )
        );
    }
}
