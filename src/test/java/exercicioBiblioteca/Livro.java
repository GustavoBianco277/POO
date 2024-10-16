package exercicioBiblioteca;
public class Livro {

	private String titulo_livro;
	private Autor autor;
	private Bibliotecario bibliotecario;
	
	public Livro(String titulo, Autor autor) {
		this.titulo_livro = titulo;
		this.autor = autor;
	}
	
	public String emprestar(String nome) {
		return nome;
	}
	
	
	public String getTitulo_livro() {
		return titulo_livro;
	}

	public void setTitulo_livro(String titulo_livro) {
		this.titulo_livro = titulo_livro;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}
}
