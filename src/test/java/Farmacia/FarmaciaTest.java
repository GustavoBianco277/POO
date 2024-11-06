package Farmacia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Farmacia.Medicamento.administracao;

class FarmaciaTest {

	Farmacia f = new Farmacia();
	
	@BeforeEach
	void inicializa() {
		f.getMedicamentos().clear();
		f.getPessoas().clear();
		f.getPrescricoes().clear();
		
		f.addPessoa("P1", "S1");
		f.addPessoa("P2", "S2");
		f.addPessoa("P3", "S2");
		
		f.addMedicamento("M1", administracao.oral, new ArrayList<String> (Arrays.asList("S1", "S2")));
		f.addMedicamento("M2", administracao.oral, new ArrayList<String> (Arrays.asList("S2")));
		f.addMedicamento("M3", administracao.oral, new ArrayList<String> (Arrays.asList("S4", "S5")));
		
	}
	
	@Test
	void prescreveMedicamentoTest() {
		assertEquals(3, f.getPessoas().size());
		assertEquals(3, f.getMedicamentos().size());
		f.prescreveMedicamento(f.getPessoas().get(0), f.getMedicamentos().get(0));
		f.prescreveMedicamento(f.getPessoas().get(1), f.getMedicamentos().get(0));
		f.prescreveMedicamento(f.getPessoas().get(2), f.getMedicamentos().get(0));
		assertEquals(3, f.getPrescricoes().size());
		f.prescreveMedicamento(f.getPessoas().get(0), f.getMedicamentos().get(1));
		f.prescreveMedicamento(f.getPessoas().get(1), f.getMedicamentos().get(1));
		f.prescreveMedicamento(f.getPessoas().get(2), f.getMedicamentos().get(1));
		assertEquals(5, f.getPrescricoes().size());
	}
	
	@Test
	void addMedicamento() {
		f.getMedicamentos().clear();
		f.addMedicamento("Dorflex", administracao.oral, new ArrayList<String> (Arrays.asList("S1", "S2")));
		f.addIndicacao_Medicamento("Dorflex", "Febre");
		f.addIndicacao_Medicamento("Dorflex", "Dor de cabeça");
		
		assertEquals(f.getMedicamentos().get(0).getNome(), "Dorflex");
	}

	@Test
	void addPessoa() {
		f.getPessoas().clear();
		f.addPessoa("Gustavo", "febre");
		
		assertEquals(f.getPessoas().get(0).getNome(), "Gustavo");
	}
	
	
}
