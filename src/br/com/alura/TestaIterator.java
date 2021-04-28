package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaIterator {

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
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador =  alunos.iterator();
		
		// Enquanto existir o proximo, me devolva o próximo
		while (iterador.hasNext()) {
				System.out.println(iterador.next());
		}
		
		
		
		// para cada aluno de "alunos" imprima o aluno
//		javaColecoes.getAlunos().forEach(a -> System.out.println(a));
//
//		Aluno a1 = new Aluno("Wanessa", 1223);
//		javaColecoes.matricula(a1);
//		Aluno a2 = new Aluno("Paula", 8223);
//		System.out.println(javaColecoes.estaMatriculado(a1));
//		System.out.println(javaColecoes.estaMatriculado(a2));
//
//		Aluno wanessa = new Aluno("Wanessa", 1223);
//		System.out.print("O a1 é == a wanessa ? ");
//		System.out.println(a1 == wanessa);
//
//		System.out.print("O a1 é equal a wanessa ? ");
//		System.out.println(a1.equals(wanessa));
		
	}

}
