
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca (Cliente nomeCliente) {
		super(nomeCliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}

}
