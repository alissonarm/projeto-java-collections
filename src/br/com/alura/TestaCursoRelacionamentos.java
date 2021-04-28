package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursoRelacionamentos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Java Básico", "Paulo");
	
		javaColecoes.adicionaAula(new Aula("Trabalhando com Listas", 21));
		javaColecoes.adicionaAula(new Aula("Criando uma aula", 20));
		javaColecoes.adicionaAula(new Aula("Modelando com coleções", 22));
		
		System.out.println(javaColecoes.getNome());
		System.out.println(javaColecoes.getAulas());
		System.out.println(javaColecoes.getInstrutor());
		
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// gera um novo objeto cópia da lista Imutavel  
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		// utiliza a ordem natural dos elementos - definido no ComparableTo
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal() + " minutos ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(javaColecoes);
		
	}

}
