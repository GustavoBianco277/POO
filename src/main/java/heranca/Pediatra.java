package heranca;

public class Pediatra extends Medico{
	private int idadeMex;

	public int getIdadeMex() {
		return idadeMex;
	}

	public void setIdadeMex(int idadeMex) {
		this.idadeMex = idadeMex;
	}
	
	@Override
	public void consultar() {
		System.out.println("Consultadinho");
	}
}
