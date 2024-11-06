package exercicioFarmaciaHeranca;

public class Medicamento extends Produto {
	private boolean receita;
	
	public Medicamento (String nome, int esq, double valor, boolean receit) {
		setNome(nome);
		setEstoque(esq);
		setValor(valor);
		receita = receit;
	}
	
	public Medicamento (String nome, int esq, double valor) {
		setNome(nome);
		setEstoque(esq);
		setValor(valor);
	}
	public boolean isRetemReceita() {
		return receita;
			
	}
	
	
	@Override
	public boolean Vender(Cliente c, int quantidade) {
		return super.Vender(c, quantidade);
	}

}
