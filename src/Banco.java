import java.util.List;

public class Banco {
	
	private String nomeBanco;
	private List<Conta> contas;
	
	public String getName() {
		return nomeBanco;
	}
	
	public void setName(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
}
