package exercicioBiblioteca;

import java.util.ArrayList;

public class Bibliotecario {
	private String nome_bibliotecario;
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public Bibliotecario(String nome) {
		this.nome_bibliotecario = nome;
	}
	
	public void addLivro(Livro livro) {
		livros.add(livro);
	}
	
	public String exibirLivros() {
		String ret = "Livros\n\n";
		for (Livro l : livros) {
			ret += "\nTitulo: " +l.getTitulo_livro()+" Autor: "+ l.getTitulo_livro();
		}
		return ret;
	}
	
	public void emprestarLivro(String titulo, String nome) {
		for (Livro livro : livros) {
			if (livro.getTitulo_livro().equals(titulo)) {
				livro.emprestar(nome); // Empresta os livros e denomina no nome dessa pessoa
				return;
			}
		}
		System.out.println("Livro não encontrado.");
	}

	public String getNome_bibliotecario() {
		return nome_bibliotecario;
	}

	public void setNome_bibliotecario(String nome_bibliotecario) {
		this.nome_bibliotecario = nome_bibliotecario;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
}
