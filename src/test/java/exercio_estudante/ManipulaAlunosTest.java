package exercio_estudante;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercio_estudante.Professor.formacao;

class ManipulaAlunosTest {
	ManipulaAlunos ma = new ManipulaAlunos();
	
	@BeforeEach
	void inicializa() {
		ma.alunos.clear();
		ma.addAluno("Jeferson");
		ma.addDiciplina(new Diciplina("Programação orientada a objetos", 20, new Professor("Clavison", formacao.graduacao), new Notas(8, 4, 3.7)), "Jeferson");
	}

	@Test
	void addAlunoTest() {
		Aluno a = ma.addAluno("Gustavo");
		Professor p = new Professor("Clavison", formacao.graduacao);
		Notas n = new Notas(9, 8, 3);
		Diciplina d = new Diciplina("Programação orientada a objetos", 20, p, n);
		a.addDiciplina(d);
		a.addDiciplina(new Diciplina("Banco de dados", 20, new Professor("Elvis", formacao.especializacao), new Notas(10, 9.7, 7)));
		
		ma.addAluno("Jeferson").addDiciplina(new Diciplina("Banco de dados", 20, new Professor("Elvis", formacao.pos_graduacao), new Notas(7, 8.5, 9)));
	}
	@Test
	void addDiciplina() {
		ma.addDiciplina(new Diciplina("Programação orientada a objetos", 20, new Professor("Clavison", formacao.graduacao), new Notas(8, 4, 3.7)), "Jeferson");
		assertEquals(ma.buscaAluno("Jeferson").getDiciplinas().get(0).getNome(), "Programação orientada a objetos");
	}
	
	@Test
	void addProfessor() {
		ma.addProfessor("Programação orientada a objetos", "Jeferson", "Clavison", formacao.pos_graduacao);
		assertEquals(ma.buscaAluno("Jeferson").getDiciplinas().get(0).getProfessor().getNome(), "Clavison");
	}
	
	@Test
	void getMedia() {
		ma.getMedia("Jeferson", "Programação orientada a objetos");
		assertEquals(ma.buscaAluno("Jeferson").getDiciplinas().get(0).getNotas().getMedia(), 5.233333333333333);
	}
}
