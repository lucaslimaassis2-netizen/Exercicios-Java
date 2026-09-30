package com.Testes.Exercicios;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tarefa tarefa = new Tarefa("Estudar Java", true, "Lucas Assis");

		tarefa.gerarArquivo(tarefa, "Minha tarefa");

	}
}
