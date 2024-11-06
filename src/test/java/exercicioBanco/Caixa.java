package exercicioBanco;

import java.util.ArrayList;

public class Caixa {

	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public void addConta(Conta c) {
		contas.add(c);
	}
	
	public boolean deposito(Conta c, double valor) {
		return c.deposito(valor);
	}
	
	public boolean saque (Conta c, double valor) {
		return c.saque(valor);
	}
	
	public boolean transferencia (Conta remetente, Conta destinatario, double valor) {
		return remetente.transferencia(valor, destinatario);
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}
}
