package org.lucashspring3.curso.demomvc.curso.Repository;

import org.lucashspring3.curso.demomvc.curso.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
