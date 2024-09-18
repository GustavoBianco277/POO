package Farmacia;

import java.util.ArrayList;

import Farmacia.Medicamento.administracao;

public class Farmacia {
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	private ArrayList<Prescricao> prescricoes = new ArrayList<Prescricao>();
	
	public void addPessoa(String nome, String sintoma) {
		pessoas.add(new Pessoa(nome, sintoma));
	}
	
	public Pessoa buscaPessoa(String nome) {
		for (Pessoa p : pessoas) {
			if (p.getNome().equals(nome)) {
				return p;
			}
		}
		return null;
	}
	
	public void addMedicamento(String nome, administracao adm) {
		medicamentos.add(new Medicamento(nome, adm));
	}
	
	public void addIndicacao_Medicamento(String medicamento, String indicacao) {
		buscaMedicamento(medicamento).getIndicacao().add(indicacao);
	}
	
	public Medicamento buscaMedicamento(String nome) {
		for (Medicamento m : medicamentos) {
			if (m.getNome().equalsIgnoreCase(nome)) {
				return m;
			}
		}
		return null;
	}
	
	public boolean prescreveMedicamento(Pessoa p, Medicamento m) {
		for (String indicacao : m.getIndicacao()) {
			if (indicacao.equalsIgnoreCase(p.getSintoma()))
				return true;
		}
		return false;
	}
	
	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public ArrayList<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public ArrayList<Prescricao> getPrescricoes() {
		return prescricoes;
	}

	public void setPrescricoes(ArrayList<Prescricao> prescricoes) {
		this.prescricoes = prescricoes;
	}

	public void addPrescricao(String pessoa, String medicamento) {
		if (prescreveMedicamento(buscaPessoa(pessoa), buscaMedicamento(medicamento))) {
			prescricoes.add(new Prescricao(buscaPessoa(pessoa), buscaMedicamento(medicamento)));
		}
	}
}
