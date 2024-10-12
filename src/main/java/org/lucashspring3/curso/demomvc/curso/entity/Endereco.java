package org.lucashspring3.curso.demomvc.curso.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long> {

    @Column(name = "logradouro", nullable = false)
    private String logradouro;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "cidade", nullable = false)
    private String cidade;


    public enum UF {

        AC("AC", "Acre"),
        AL("AL", "Alagoas"),
        AM("AM", "Amazonas"),
        BA("BA", "Bahia"),
        CE("CE", "Ceará"),
        DF("DF", "Distrito Federal"),
        ES("ES", "Espírito Santo"),
        GO("GO", "Goiás"),
        MA("MA", "Maranhão"),
        MT("MT", "Mato Grosso"),
        MS("MS", "Mato Grosso do Sul"),
        MG("MG", "Minas Gerais"),
        PA("PA", "Pará"),
        PB("PB", "Paraíba"),
        PR("PR", "Paraná"),
        PE("PE", "Pernambuco"),
        PI("PI", "Piauí"),
        RJ("RJ", "Rio de Janeiro"),
        RN("RN", "Rio Grande do Norte"),
        RS("RS", "Rio Grande do Sul"),
        RO("RO", "Rondônia"),
        RR("RR", "Roraima"),
        SC("SC", "Santa Catarina"),
        SP("SP", "São Paulo"),
        SE("SE", "Sergipe"),
        TO("TO", "Tocantins");
    }
}
