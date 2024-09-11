package exercio_estudante;

public class Diciplina {
	private String nome;
	private int carga_horaria;
	private Professor professor;
	private Notas notas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(int carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Notas getNotas() {
		return notas;
	}

	public void setNotas(Notas notas) {
		this.notas = notas;
	}

	public Diciplina(String nome, int carga, Professor professor) {
		this.nome = nome;
		this.carga_horaria = carga;
		this.professor = professor;
	}
	
	public Diciplina(String nome, int carga, Professor professor, Notas notas) {
		this.nome = nome;
		this.carga_horaria = carga;
		this.professor = professor;
		this.notas = notas;
	}

}
