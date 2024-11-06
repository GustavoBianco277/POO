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
	
	public Medicamento buscaMedicamento(String nome) {
		for (Medicamento m : medicamentos) {
			if (m.getNome().equalsIgnoreCase(nome)) {
				return m;
			}
		}
		return null;
	}
	
	public void addMedicamento(String nome, administracao adm, ArrayList<String> s) {
		medicamentos.add(new Medicamento(nome, adm, s));
	}
	
	public void addIndicacao_Medicamento(String medicamento, String indicacao) {
		buscaMedicamento(medicamento).getIndicacao().add(indicacao);
	}
	
	public boolean prescreveMedicamento(Pessoa p, Medicamento m) {
		for (String indicacao : m.getIndicacao()) {
			if (indicacao.equalsIgnoreCase(p.getSintoma())) {
				prescricoes.add(new Prescricao(p, m));
				return true;
				}
		}
		return false;
	}
	
	public void addPrescricao(String pessoa, String medicamento) {
		prescreveMedicamento(buscaPessoa(pessoa), buscaMedicamento(medicamento));
	}
	
	public String medicamentosPorPessoa(String nome) {
		String ret = "";
		for (Prescricao presc : prescricoes) {
			if (presc.getPessoa().getNome().equalsIgnoreCase(nome)){
				ret += presc.getMedicamento();
			}
		}
		return ret;
	}
	
	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public ArrayList<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public ArrayList<Prescricao> getPrescricoes() {
		return prescricoes;
	}
}
