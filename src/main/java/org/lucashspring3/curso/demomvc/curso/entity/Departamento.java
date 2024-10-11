package org.lucashspring3.curso.demomvc.curso.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Table(name = "departamentos")
public class Departamento {

    @Column(name = "id", nullable = false, unique = true)
    private Long id;
}
