package exercicioFarmaciaHeranca;

import java.text.DecimalFormat;

public class Cliente {
	private String nome;
	private double saldo_devedor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo_devedor() {
		return saldo_devedor;
	}
	public void setSaldo_devedor(double saldo_devedor) {
		this.saldo_devedor = saldo_devedor;
	}
	
	@Override
	public String toString() {
		return String.format("Cliente: %s - Saldo devedor: %s", getNome(), getSaldo_devedor()); 
	}
}
