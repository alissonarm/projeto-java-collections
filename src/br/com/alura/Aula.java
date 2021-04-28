package br.com.alura;

public class Aula implements Comparable<Aula> {

		private String titulo;
		private int tempo;
		
		public Aula(String titulo, int tempo) {
			this.titulo = titulo;
			this.tempo = tempo;
		}

		public String getTitulo() {
			return titulo;
		}

		public int getTempo() {
			return tempo;
		}

		@Override
		public String toString() {
			return "Aula [titulo=" + this.titulo + ", tempo=" + this.tempo + " minutos ]";
		}

		@Override
		public int compareTo(Aula outraAula) {
			// devolve negativo se this.titulo < outraAula.titulo ; positivo se this.titulo > outraAula.titulo e zero se this.titulo = outraAula.titulo
			return this.titulo.compareTo(outraAula.titulo);
		}
		
		
		
		
		
}
