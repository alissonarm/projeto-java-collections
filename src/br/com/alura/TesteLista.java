package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TesteLista {

	public static void main(String[] args) {

		String aula00 = "Conhecendo mais de listas";
		String aula01 = "Modelando a classe Aula";
		String aula02 = "Trabalhando com cursos e Sets";
		String aula03 = "Trabalhando com aListas avançado";
		String aula04 = "Aumentando o conhecimento";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		System.out.println(aulas);
		aulas.add(aula00);
		aulas.add(aula01);
		aulas.add(aula02);
		aulas.add(aula03);
		aulas.add(aula04);
		System.out.println(aulas);
		System.out.println(aulas.size());
	
		aulas.remove(0);
		System.out.println(aulas);
		
		System.out.println("===========================");
		
		// Para cada aula dentro de aulas faça
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		System.out.println("===========================");
		
		String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);
		
		System.out.println("===========================");		
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}
		System.out.println("===========================");
		
		// para cada aula faça
		aulas.forEach(aula -> {
			System.out.println("Percorrendo .... ");
			System.out.println("Aula " + aula);
		});
		
		System.out.println("===========================");
		Collections.sort(aulas); 
		aulas.forEach(aula -> System.out.println("Aula: " + aula));

		
	}

}
