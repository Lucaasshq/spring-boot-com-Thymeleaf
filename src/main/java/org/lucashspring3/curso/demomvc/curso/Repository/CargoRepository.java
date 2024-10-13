package org.lucashspring3.curso.demomvc.curso.Repository;

import org.lucashspring3.curso.demomvc.curso.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
