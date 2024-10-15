package org.lucashspring3.curso.demomvc.curso.service;

import org.lucashspring3.curso.demomvc.curso.Repository.CargoRepository;
import org.lucashspring3.curso.demomvc.curso.entity.Cargo;
import org.lucashspring3.curso.demomvc.curso.exeception.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class CargoService {

    private final CargoRepository cargoRepository;

    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    @Transactional(readOnly = false)
    public void salvar(Cargo cargo) {
         cargoRepository.save(cargo);
    }

    @Transactional(readOnly = false)
    public void editar(Cargo cargo) {
        cargoRepository.save(cargo);
    }

    @Transactional(readOnly = false)
    public void excluir(Cargo cargo) {
        cargoRepository.delete(cargo);
    }

    @Transactional(readOnly = true)
    public List<Cargo> buscarTodosCargos() {
        return cargoRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Cargo buscarPorId(Long id) {
        return cargoRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Cargo de id" + id + " não encontrado")
        );
    }


}
