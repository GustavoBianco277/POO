package exercicioBanco;

public class ContaCorrente extends Conta{

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	@Override
	public boolean saque(double valor) {
		if (valor <= getSaldo()) {
			return super.saque(valor); 
		}
		return false;
	}
}
