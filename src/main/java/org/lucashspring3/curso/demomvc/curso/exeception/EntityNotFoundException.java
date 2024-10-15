package org.lucashspring3.curso.demomvc.curso.exeception;

import lombok.Getter;
import lombok.Setter;


public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    }
}
