package exercicioBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();
	private ArrayList<Autor> autores = new ArrayList<Autor>();
	
	public Bibliotecario addBibliotecario(String nome) {
		Bibliotecario b = new Bibliotecario(nome);
		bibliotecarios.add(b);
		return b;
	}
	
	
	public ArrayList<Bibliotecario> getBibliotecarios() {
		return bibliotecarios;
	}

	public void addLivro(Bibliotecario b, Livro livro) {
		b.addLivro(livro);
	}
	
	public void addLivro(Autor a, Livro livro) {
		a.addLivro(livro);
	}
	
	public Autor addAutor(String nome) {
		Autor a = new Autor(nome);
		autores.add(a);
		return a;
	}


	public ArrayList<Autor> getAutores() {
		return autores;
	}
}
