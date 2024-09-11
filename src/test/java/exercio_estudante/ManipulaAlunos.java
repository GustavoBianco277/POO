package exercio_estudante;

import java.util.ArrayList;

public class ManipulaAlunos {
	
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	Aluno addAluno(String nome) {
		Aluno a = new Aluno(nome);
		alunos.add(a);
		return a;
	}
	
	Aluno buscaAluno(String nome) {
		for (Aluno a : alunos) {
			if (a.getNome().equalsIgnoreCase(nome)) {
				return a;
			}
		}
		return null;
	}
	
	Diciplina buscaDisciplina(String nome, Aluno aluno) {
		for (Diciplina d : aluno.getDiciplinas()) {
			if (d.getNome().equalsIgnoreCase(nome)) {
				return d;
			}
		}
		return null;
	}
	
	void addDiciplina (Diciplina diciplina, String nome) {
		buscaAluno(nome).getDiciplinas().add(diciplina);
	}
	
	double getMedia (String aluno, String dic) {
		return buscaDisciplina(dic, buscaAluno(aluno)).getNotas().getMedia(); 
	}
}
