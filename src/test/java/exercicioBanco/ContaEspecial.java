package exercicioBanco;

public class ContaEspecial extends Conta {
	private double limiteSaque = 1000;
	private double limiteTransferencia = 2000;
	
	public ContaEspecial(int numero, int agencia, double lSaque, double Ltransferencia) {
		super(numero, agencia);
		setLimiteSaque(lSaque);
		setLimiteTransferencia(Ltransferencia);
	}

	@Override
	public boolean saque(double valor) {
		if (valor <= getLimiteSaque())
			return super.saque(valor);
		return false;
	}

	@Override
	public boolean transferencia(double valor, Conta conta) {
		if (valor <= getLimiteTransferencia())
			return super.transferencia(valor, conta);
		return false;
	}
	
	
	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public double getLimiteTransferencia() {
		return limiteTransferencia;
	}

	public void setLimiteTransferencia(double limiteTransferencia) {
		this.limiteTransferencia = limiteTransferencia;
	}
	
}
