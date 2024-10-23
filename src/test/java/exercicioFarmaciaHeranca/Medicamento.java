package exercicioFarmaciaHeranca;

public class Medicamento extends Produto {
	
	@Override
	public boolean Vender(Cliente c, int quantidade) {
		return super.Vender(c, quantidade);
	}

}
