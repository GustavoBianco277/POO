package exercicioBanco;

public class ContaUniversitaria extends Conta {
	
	public ContaUniversitaria(int numero, int agencia) {
		super(numero, agencia);
	}
	@Override
	public boolean saque(double valor) {
		if (valor <= getSaldo()) {
			return super.saque(valor); 
		}
		return false;
	}
	
	
	@Override
	public boolean deposito(double valor) {
		if (getSaldo() + valor <= 2000)
			return super.deposito(valor);
		return false;
	}
}
