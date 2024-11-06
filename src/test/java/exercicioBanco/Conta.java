package exercicioBanco;

public class Conta {
	private int numero;
	private int agencia;
	private double saldo;
	
	public Conta() {}
	
	public Conta(int numero, int agencia) {
		this.numero = numero;
		this.agencia = agencia;
	}
	
	public boolean deposito(double valor) {
		setSaldo(getSaldo() + valor);
		return true;
	}
	
	public boolean saque(double valor) {
		setSaldo(getSaldo() - valor);
		return true;
	}
	
	public boolean transferencia(double valor, Conta c) {
		if (c.getAgencia() == getAgencia()) {
			if (saque(valor)) {
				if(c.deposito(valor)) {
					return true;
				}
				else {
					deposito(valor);
				}
			}
		}
		return false;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
