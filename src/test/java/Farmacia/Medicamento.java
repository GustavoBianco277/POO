package Farmacia;

import java.util.ArrayList;

public class Medicamento {
	public enum administracao{
		injetavel,
		topico,
		oral
	}
	
	private String nome;
	private administracao administracao;
	private ArrayList<String> indicacoes = new ArrayList<String>();
	
	
	public Medicamento(String nome, administracao adm) {
		this.nome = nome;
		this.administracao = adm;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public administracao getAdministracao() {
		return administracao;
	}


	public void setAdministracao(administracao administracao) {
		this.administracao = administracao;
	}

	public ArrayList<String> getIndicacao() {
		return indicacoes;
	}


	public void setIndicacao(ArrayList<String> indicacao) {
		this.indicacoes = indicacao;
	}
}
