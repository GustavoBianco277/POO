package Farmacia;

public class Prescricao {
	private Pessoa pessoa = null;
	private Medicamento medicamento = null;
	
	public Prescricao(Pessoa pessoa, Medicamento medicamento){
		this.pessoa = pessoa;
		this.medicamento = medicamento;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Medicamento getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	@Override
	public String toString() {
		return pessoa + " - " + medicamento;
	}
}
