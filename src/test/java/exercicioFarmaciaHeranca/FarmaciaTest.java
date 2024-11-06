package exercicioFarmaciaHeranca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FarmaciaTest {

	ArrayList<Produto> produtos = new ArrayList<Produto>();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	@BeforeEach
	void inicializar() {
		clientes.add(new Cliente("A", 0));
		clientes.add(new Cliente("B", 200));
		
		produtos.add(new Medicamento("M1", 5, 50, false));
		//produtos.add(new Perfumaria("P1", 5, 50));
		//produtos.add(new Hospitalar("H1", 0, 50));
		
		
	}

	@Test
	void vendasTest() {
		produtos.get(0).Vender(clientes.get(0), 1);
		produtos.get(1).Vender(clientes.get(0), 1);
		produtos.get(2).Vender(clientes.get(0), 1);
		
		assertEquals(150.0, clientes.get(0).getSaldo_devedor());
		assertEquals(4, produtos.get(0).getEstoque());
		assertEquals(4, produtos.get(1).getEstoque());
		assertEquals(4, produtos.get(2).getEstoque());
	}
}
