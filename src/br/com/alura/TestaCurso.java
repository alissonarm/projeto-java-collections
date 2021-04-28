package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Java Básico", "Paulo");
//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas);
//		System.out.println(aulas.size());
//		
//		aulas.add(new Aula("Trabalhando com Listas", 21));
//		System.out.println(aulas);
//		System.out.println(aulas.size());
//		System.out.println(javaColecoes.getAulas());
//		System.out.println(javaColecoes==aulas);
//		System.out.println(javaColecoes.getAulas()==aulas);
		
//		javaColecoes.getAulas().add(new Aula("Trabalhando com Listas", 21));
	
		javaColecoes.adicionaAula(new Aula("Trabalhando com Listas", 21));
		javaColecoes.adicionaAula(new Aula("Criando uma aula", 20));
		javaColecoes.adicionaAula(new Aula("Modelando com coleções", 22));
		
		System.out.println(javaColecoes.getNome());
		System.out.println(javaColecoes.getAulas());
		System.out.println(javaColecoes.getInstrutor());
		
	}

}
