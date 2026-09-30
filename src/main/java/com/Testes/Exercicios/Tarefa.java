package com.Testes.Exercicios;

import tools.jackson.databind.ObjectMapper;

import java.io.File;

public class Tarefa implements Imedtodos {
    ObjectMapper mapper = new ObjectMapper();

    private String descricao;
    private boolean concluida;
    private String responsavel;

    public Tarefa(String descricao, boolean concluida, String responsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.responsavel = responsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getResponsavel() {
        return responsavel;
    }


    @Override
    public String toString() {
        return " Descrição: " + descricao +
                " Status: " + concluida +
                " Responsavel: " + responsavel;
    }

    @Override
    public <T> void gerarArquivo(T objeto, String nomeDoArquivo) {
        mapper.writeValue(new File(nomeDoArquivo + ".json"), objeto);
    }
}
