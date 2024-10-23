package exercicioFarmaciaHeranca;

import java.util.ArrayList;

public class Farmacia {
	private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	private ArrayList<Perfumaria> perfumarias = new ArrayList<Perfumaria>();
	private ArrayList<Hospitalar> hospitalares = new ArrayList<Hospitalar>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void addProduto (Medicamento m) {
		medicamentos.add(m);
	}
	public void addProduto (Perfumaria p) {
		perfumarias.add(p);
	}
	public void addProduto (Hospitalar h) {
		hospitalares.add(h);
	}
	
	public boolean Vender(Medicamento m, Cliente c, int quant) {
		return m.Vender(c, quant);
	}
	public boolean Vender(Perfumaria p, Cliente c, int quant) {
		return p.Vender(c, quant);
	}
	public boolean Vender(Hospitalar h, Cliente c, int quant) {
		return h.Vender(c, quant);
	}
	
	
	public double pagarDivida(Cliente c, double valor) {
		// retora o troco se o valor for maior que a divida
		
		if (valor > c.getSaldo_devedor()) {
			c.setSaldo_devedor(0);
			return valor - c.getSaldo_devedor();
		}
		
		else {
			c.setSaldo_devedor(c.getSaldo_devedor() - valor);
			return 0;
		}
	}
	
	public String relatorioProdutos() {
		String ret = "Produtos:\n\n";
		ret += "=====Medicamentos=====";
		for (Medicamento m : medicamentos) {
			ret += "\n"+ m;
		}
		ret += "=====Perfumaria=====";
		for (Perfumaria p : perfumarias) {
			ret += "\n"+ p;
		}
		ret += "=====Hospitalares=====";
		for (Hospitalar h : hospitalares) {
			ret += "\n"+ h;
		}
		return ret;
	}
	
	public String relatorioClientes() {
		String ret = "Clientes\n\n";
		for (Cliente c : clientes) {
			ret += "\n"+ c;
		}
		return ret;
	}
}
