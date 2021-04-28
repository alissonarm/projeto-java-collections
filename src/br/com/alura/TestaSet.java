package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaSet {

	public static void main(String[] args) {
		// set = conjunto sem garantia da ordem da apresentacao
		// set não aceita elementos repetidos
		// Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>();
		alunos.add("Renata");
		alunos.add("Emilio");
		alunos.add("Timoteo");
		alunos.add("Esio");
		alunos.add("Jorge");
		alunos.add("Rodrigo");
		alunos.add("Esio"); // elemento repetido não será incluido
		System.out.println(alunos);
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// para cada aluno de "alunos" imprima o aluno
		alunos.forEach(aluno -> System.out.println(aluno));

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println(alunos.contains("Paulo"));
		System.out.println(alunos.contains("Esio"));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		alunos.remove("Emilio");
		System.out.println(alunos);

		
		// criando uma Lista do tipo ArrayList a partir da interface Collection
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		
	}

}
