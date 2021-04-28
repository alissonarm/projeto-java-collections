package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class TestaColecaoMap {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Java Básico", "Paulo");

		javaColecoes.adicionaAula(new Aula("Trabalhando com Listas", 21));
		javaColecoes.adicionaAula(new Aula("Trabalhando com Sets", 20));
		javaColecoes.adicionaAula(new Aula("Modelando com coleções", 22));

		javaColecoes.matricula(new Aluno("Rodrigo", 4123));
		javaColecoes.matricula(new Aluno("Lidnaldo", 5253));
		javaColecoes.matricula(new Aluno("Wendell", 6123));
		javaColecoes.matricula(new Aluno("Ana Paula", 7103));
		javaColecoes.matricula(new Aluno("Francisco", 8173));
		
		javaColecoes.getMatriculaParaAluno().keySet().forEach(aluno -> System.out.println(javaColecoes.getMatriculaParaAluno()));
		
		System.out.println("Quem é o Aluno com a matricula 7103?");
		Aluno aluno = javaColecoes.buscaMatriculado(7103);
		
		System.out.println(aluno);

	}

}
