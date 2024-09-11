package exercio_estudante;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private ArrayList<Diciplina> diciplinas = new ArrayList<Diciplina>();
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	void addDiciplina (Diciplina diciplina) {
		diciplinas.add(diciplina);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Diciplina> getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(ArrayList<Diciplina> diciplinas) {
		this.diciplinas = diciplinas;
	}
}
