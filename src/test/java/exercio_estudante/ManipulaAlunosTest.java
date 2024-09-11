package exercio_estudante;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManipulaAlunosTest {
	ManipulaAlunos ma = new ManipulaAlunos();

	@Test
	void addAlunoTest() {
		Aluno a = ma.addAluno("Gustavo");
		Professor p = new Professor("Clavison", 30);
		Notas n = new Notas(9, 8, 3);
		Diciplina d = new Diciplina("Programação orientada a objetos", 20, p, n);
		a.addDiciplina(d);
		a.addDiciplina(new Diciplina("Banco de dados", 20, new Professor("Elvis", 2), new Notas(10, 9.7, 7)));
		
		ma.addAluno("Jeferson").addDiciplina(new Diciplina("Banco de dados", 20, new Professor("Elvis", 2), new Notas(7, 8.5, 9)));;
		ma.addDiciplina(new Diciplina("Programação orientada a objetos", 20, new Professor("Clavison", 30), new Notas(8, 4, 3.7)), "Jeferson");
		
		assertNotNull(ma.buscaAluno("Gustavo"));
		assertNotNull(ma.buscaDisciplina("Banco de dados", ma.buscaAluno("Gustavo")));
		assertEquals(ma.buscaDisciplina("Banco de dados", ma.buscaAluno("Gustavo")).getProfessor().getNome(), "Elvis");
		assertEquals(ma.getMedia("Gustavo", "Banco de dados"), 8.9);
		assertEquals(ma.buscaDisciplina("Programação orientada a objetos", ma.buscaAluno("Gustavo")).getNotas().getN1(), 9);
	}
}
