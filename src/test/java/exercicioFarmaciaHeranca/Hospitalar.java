package exercicioFarmaciaHeranca;

public class Hospitalar extends Produto {
	
	@Override
	public boolean Vender(Cliente c, int quantidade) {
		c.setSaldo_devedor(getValor() * quantidade);
		return true;
	}
}
