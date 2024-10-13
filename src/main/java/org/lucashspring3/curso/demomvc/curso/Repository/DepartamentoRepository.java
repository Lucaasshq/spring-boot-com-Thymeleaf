package org.lucashspring3.curso.demomvc.curso.Repository;

import org.aspectj.apache.bcel.Repository;
import org.lucashspring3.curso.demomvc.curso.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
