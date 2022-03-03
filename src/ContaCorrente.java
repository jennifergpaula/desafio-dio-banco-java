
public class ContaCorrente extends Conta {
	
	public ContaCorrente (Cliente nomeCliente) {
		super(nomeCliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
