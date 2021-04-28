package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
//	private ArrayList<Aula> aulas;
//  Recomeda-se utilizar List pois podemos trabalha com as listas(Linkedlist, ArrayList)	
	private List<Aula> aulas = new LinkedList<Aula>();
	
	//HashSet não guarda a ordem;
	// private Set<Aluno> alunos = new LinkedHashSet<>(); ==> LinkedHashSet - guarda a ordem 
	// private Set<Aluno> alunos = new TreeSet<>(); ==> TreeSet - Só funciona para classes comparable
	private Set<Aluno> alunos = new HashSet<>(); 
	
	// Dado um integer, guarda o Aluno
	// private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Map<Integer, Aluno> getMatriculaParaAluno() {
		return matriculaParaAluno;
	}

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
//		return aulas;
		return Collections.unmodifiableList(aulas); // unmodifiableSet - não permite alteração
	}

	public void adicionaAula(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
//		int tempoTotal = 0; 
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;

		return this.aulas.stream().mapToInt(Aula::getTempo).sum();

	}

	@Override
	public String toString() {
		return "[ Curso: " + this.nome + " , tempo total: " + this.getTempoTotal() + " minutos, aulas: " + this.aulas
				+ " ]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);  // unmodifiableSet - não permite alteração
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int matricula) {
//		for (Aluno aluno : alunos) {
//			if (aluno.getNumeroMatricula() == matricula) {
//				return aluno;
//			}
//		}
//		throw new NoSuchElementException("Matricula não encontrada");
		
		if (!matriculaParaAluno.containsKey(matricula)) 
			throw new NoSuchElementException("Matricula não encontrada");
		
		return matriculaParaAluno.get(matricula);
	}
	
	
}
