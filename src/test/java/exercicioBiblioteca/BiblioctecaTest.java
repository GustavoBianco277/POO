package exercicioBiblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BiblioctecaTest {

	Biblioteca b = new Biblioteca();
	
	@BeforeEach
	void inicializa() {
		b.addBibliotecario("Gustavo");
		b.addBibliotecario("Davi");
		
		b.addAutor("Gustavo1");
		b.addAutor("Gustavo2");
	}
	
	@Test
	void addBibliotecario() {
		b.getBibliotecarios().clear();
		//add bibliotecario Gustavo e Davi
		b.addBibliotecario("Gustavo");
		b.addBibliotecario("Davi");
		// verifica se tem 2 na lista
		assertEquals(2, b.getBibliotecarios().size());
		// verifica se o primeiro tem o nome Gustavo
		assertEquals("Gustavo", b.getBibliotecarios().get(0).getNome_bibliotecario());
	}
	
	@Test
	void addLivrosBibliotecario() {
		b.getBibliotecarios().get(0).getLivros().clear();
		
		b.addLivro(b.getBibliotecarios().get(0), new Livro("A1", new Autor("B1")));
		b.addLivro(b.getBibliotecarios().get(0), new Livro("A2", new Autor("B1")));
		b.addLivro(b.getBibliotecarios().get(0), new Livro("A3", new Autor("B1")));
		
		//verifica se adicionou 3 livros
		assertEquals(3, b.getBibliotecarios().get(0).getLivros().size());
	}
	
	@Test
	void addLivrosAutor() {
		if (b.getAutores().get(0).getLivros() != null)
			b.getAutores().get(0).getLivros().clear();
		
		b.addLivro(b.getAutores().get(0), new Livro("A1", new Autor("B1")));
		b.addLivro(b.getAutores().get(0), new Livro("A2", new Autor("B1")));
		b.addLivro(b.getAutores().get(0), new Livro("A3", new Autor("B1")));
		
		//verifica se adicionou 3 livros
		assertEquals(3, b.getAutores().get(0).getLivros().size());
	}
	
	@Test
	void addAutor() {
		b.getAutores().clear();
		
		b.addAutor("Gustavo1");
		b.addAutor("Gustavo2");
		b.addAutor("Gustavo3");
		
		// verifica se tem 3 na lista
		assertEquals(3, b.getAutores().size());
		// verifica se o primeiro tem o nome Gustavo
		assertEquals("Gustavo2", b.getAutores().get(1).getNome_autor());
	}
	
	
}
















