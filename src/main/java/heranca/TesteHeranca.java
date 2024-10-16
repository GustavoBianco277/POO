package heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Pessoa1");
		p.setIdade(1);
		System.out.println(p);
		
		Medico m = new Medico();
		m.setNome("Médico1");
		m.setIdade(2);
		m.setCrm(1111);
		System.out.println(m);
		
		Pediatra pd = new Pediatra();
		pd.setNome("Pediatra1");
		pd.setIdade(3);
		pd.setCrm(2222);
		pd.setIdadeMex(8);
		System.out.println(pd);
		pd.consultar();
		Cardologista c = new Cardologista();
		c.setNome("Cardiologista1");
		c.setIdade(4);
		c.setCrm(3333);
		System.out.println(c);
		c.consultar();
		
		
		System.out.println(p.getClass());
	}

}
