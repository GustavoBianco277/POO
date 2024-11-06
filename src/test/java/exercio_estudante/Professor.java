package exercio_estudante;

public class Professor {
	
	public enum formacao{
		graduacao,
		especializacao,
		pos_graduacao
	}
	
	private String nome;
	private formacao formacao;
	
	public Professor(String nome, formacao formacao) {
		this.nome = nome;
		this.formacao = formacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public formacao getFormacao() {
		return formacao;
	}

	public void setFormacao(formacao formacao) {
		this.formacao = formacao;
	}
}
