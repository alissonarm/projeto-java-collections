package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome n�o pode ser nulo!");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Aluno a = (Aluno) obj;
		return this.nome.equals(a.nome);
	}

	
	// Sempre que sobrescrever o m�todo equals, sobrescreva tamb�m o m�todo hashCode
	//hashCode � o c�digo de espalhamento gerado para o objeto. 
	@Override
	public int hashCode() {
//		return this.nome.charAt(0);
		return this.nome.hashCode(); // utilizando o hashCode implementado na classe String
	}
	
}
