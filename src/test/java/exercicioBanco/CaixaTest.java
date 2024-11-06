package exercicioBanco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaixaTest {

	Caixa caixa = new Caixa();
	
	@BeforeEach
	void initialize() {
		caixa.addConta(new ContaCorrente(10,1));
		caixa.addConta(new ContaCorrente(20,2));
		caixa.addConta(new ContaEspecial(30,1, 1000, 2000));
		caixa.addConta(new ContaEspecial(40,2, 1000, 2000));
		caixa.addConta(new ContaUniversitaria(50,1));
		caixa.addConta(new ContaUniversitaria(60,2));
	}
	@Test
	void deposito() {
		caixa.deposito(caixa.getContas().get(0), 500);
		caixa.deposito(caixa.getContas().get(1), 500);
		caixa.deposito(caixa.getContas().get(2), 500);
		caixa.deposito(caixa.getContas().get(3), 500);
		caixa.deposito(caixa.getContas().get(4), 500);
		caixa.deposito(caixa.getContas().get(5), 500);
		assertEquals(500, caixa.getContas().get(0).getSaldo());
		assertEquals(500, caixa.getContas().get(1).getSaldo());
		assertEquals(500, caixa.getContas().get(2).getSaldo());
		assertEquals(500, caixa.getContas().get(3).getSaldo());
		assertEquals(500, caixa.getContas().get(4).getSaldo());
		assertEquals(500, caixa.getContas().get(5).getSaldo());
		// tentativa de deposito acima do saldo permitido
		assertEquals(false, caixa.deposito(caixa.getContas().get(4), 1501));
	}
	
	@Test
	void saque() {
		// tentativa de saque maior que o saldo na conta corrente
		assertEquals(false, caixa.saque(caixa.getContas().get(0), 250));
		// tentativa de saque maior que o limite na conta especial
		caixa.deposito(caixa.getContas().get(2), 1000);
		assertEquals(false, caixa.saque(caixa.getContas().get(2), 1100));
		// tentativa de saque maior que 2000 na conta universitaria
		caixa.deposito(caixa.getContas().get(4), 2000);
		assertEquals(false, caixa.saque(caixa.getContas().get(4), 2100));
		
		// saque com sucesso
		caixa.saque(caixa.getContas().get(0), 50);
		assertEquals(0, caixa.getContas().get(0).getSaldo());
	}
	
	@Test
	void transferencia() {
		// tentativa de transferir um valor acima do saldo
		assertEquals(false, caixa.transferencia(caixa.getContas().get(0), caixa.getContas().get(2), 250));
		// tentativa de transferir acima do limite da conta especial
		caixa.deposito(caixa.getContas().get(0), 2000);
		assertEquals(false, caixa.transferencia(caixa.getContas().get(4), caixa.getContas().get(2), 2100));
		// tentativa de receber acima de 2000
		assertEquals(false, caixa.transferencia(caixa.getContas().get(0), caixa.getContas().get(5), 2000));
		// tentativa de tranferencia para outra agencia
		assertEquals(false, caixa.transferencia(caixa.getContas().get(0), caixa.getContas().get(1), 500));
		// tranferencia com sucesso
		caixa.deposito(caixa.getContas().get(2), 1000);
		caixa.transferencia(caixa.getContas().get(2), caixa.getContas().get(4), 1000);
		assertEquals(0, caixa.getContas().get(2).getSaldo());
		assertEquals(1000, caixa.getContas().get(4).getSaldo());
	}

}

