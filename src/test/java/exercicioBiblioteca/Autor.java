package exercicioBiblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class Autor {
	private String nome_autor;
	private ArrayList<Livro> livros;
	
	public Autor(String nome) {
		this.nome_autor = nome;
	}
	
	public void addLivro(Livro livro) {
		if (livros == null) 
			livros = new ArrayList<Livro>(Arrays.asList(livro));
		
		else
			livros.add(livro);
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
}
