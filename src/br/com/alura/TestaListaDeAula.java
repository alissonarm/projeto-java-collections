package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisando os Arraylists" , 24);
		Aula a2 = new Aula("Lista de Objetos" , 20);
		Aula a3 = new Aula("Relacionamento de Listas e Objetos" , 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);

		// aqui a ordena pelo titulo - definido no metodo CompareTo
		Collections.sort(aulas);
		System.out.println(aulas);
		
//		String s1 = "Alisson";
//      String s2 = "Alisson";
//      // metodo compareTo devolve negativo se s1 < s2 ; positivo se s1 > s2 e zero se s1 = s2
//      System.out.println(s1.compareTo(s2));
		
		
		// ordenacao pelo tempo
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		// ordenação pelo tempo
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		

	}

}
