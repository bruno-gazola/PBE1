package prjCaneta;

public class Livro {

	String nomeLivro;
	String autor;
	boolean alugado;
	public Livro (String nomeLivro, String autor) {
		this.nomeLivro = Livro;
		this.autor = autor;
		this.alugado = false;
		
	}
	
	void alugar() {
        this.alugado = true;
	}
	
	void status() {
		System.out.println(this.nomeLivro+": "+(this.alugado ? "Alugado":"Disponível"));
	}
	
	
}
