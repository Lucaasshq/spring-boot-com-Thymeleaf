package org.lucashspring3.curso.demomvc.curso.service;

import org.lucashspring3.curso.demomvc.curso.Repository.FuncionarioRepository;
import org.lucashspring3.curso.demomvc.curso.entity.Funcionario;
import org.lucashspring3.curso.demomvc.curso.exeception.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }
    @Transactional(readOnly = false)
    public void salvar(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }
    @Transactional(readOnly = false)
    public void editar(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }
    @Transactional(readOnly = false)
    public void excluir(Long id) {
        funcionarioRepository.deleteById(id);
    }
    @Transactional(readOnly = true)
    public Funcionario buscarPorId(Long id) {
        return funcionarioRepository.findById(id).orElseThrow(
                ()  -> new EntityNotFoundException("Funcionario com id " + id + " não encontrado")
        );
    }
    @Transactional(readOnly = true)
    public List<Funcionario> buscarTodosFuncionarios() {
        return funcionarioRepository.findAll();
    }




}
