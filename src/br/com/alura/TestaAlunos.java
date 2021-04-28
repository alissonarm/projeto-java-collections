package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Java Básico", "Paulo");
		
		javaColecoes.adicionaAula(new Aula("Trabalhando com Listas", 21));
		javaColecoes.adicionaAula(new Aula("Trabalhando com Sets", 20));
		javaColecoes.adicionaAula(new Aula("Modelando com coleções", 22));

		System.out.println("Aulas do Curso");
		System.out.println("==============");
		
		javaColecoes.getAulas().forEach(aula -> System.out.println(aula));
		
		
//		Aluno a1 = new Aluno("Rodrigo", 123);
//		javaColecoes.matricula(a1);
				 
		javaColecoes.matricula(new Aluno("Rodrigo", 4123));
		javaColecoes.matricula(new Aluno("Lidnaldo", 5253));
		javaColecoes.matricula(new Aluno("Wendell", 6123));
		javaColecoes.matricula(new Aluno("Ana Paula", 7103));
		javaColecoes.matricula(new Aluno("Francisco", 8173));

		System.out.println("Alunos Matriculados");
		System.out.println("===================");
		
		// para cada aluno de "alunos" imprima o aluno
		javaColecoes.getAlunos().forEach(a -> System.out.println(a));

		Aluno a1 = new Aluno("Wanessa", 1223);
		javaColecoes.matricula(a1);
		Aluno a2 = new Aluno("Paula", 8223);
		System.out.println(javaColecoes.estaMatriculado(a1));
		System.out.println(javaColecoes.estaMatriculado(a2));

	}

}
