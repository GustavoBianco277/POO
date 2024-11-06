package exercicioFarmaciaHeranca;

public class Perfumaria extends Produto {
	
	public Perfumaria() {
		
	}
	@Override
	public boolean Vender(Cliente c, int quantidade) {
		if (getEstoque() >= quantidade && c.getSaldo_devedor() < 100) {
			setEstoque(getEstoque() - quantidade);
			c.setSaldo_devedor(c.getSaldo_devedor() + getValor() * quantidade);
			return true;
		}
		return false;
	}
}
