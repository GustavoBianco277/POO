package Farmacia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Farmacia.Medicamento.administracao;

class FarmaciaTest {

	Farmacia fa = new Farmacia();
	@Test
	void addMedicamento() {
		fa.addMedicamento("Dorflex", administracao.oral);
		fa.addIndicacao_Medicamento("Dorflex", "Febre");
		fa.addIndicacao_Medicamento("Dorflex", "Dor de cabeça");
		
		assertEquals(fa.getMedicamentos().get(0).getNome(), "Dorflex");
	}

	@Test
	void addPessoa() {
		fa.addPessoa("Gustavo", "febre");
		
		assertEquals(fa.getPessoas().get(0).getNome(), "Gustavo");
	}
	
	
}
