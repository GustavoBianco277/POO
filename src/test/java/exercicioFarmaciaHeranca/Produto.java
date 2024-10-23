package exercicioFarmaciaHeranca;

public class Produto {
	private String nome;
	private int estoque;
	private double valor;
	
	public boolean Vender(Cliente c, int quantidade) {
		if (estoque >= quantidade) {
			estoque -= quantidade;
			c.setSaldo_devedor(valor * quantidade);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return getNome() +" - "+getEstoque()+" - "+ getValor();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
