
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	private Cliente nomeCliente;
	
	public Conta(Cliente nomeCliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.nomeCliente = nomeCliente;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println (String.format("Nome do Cliente: %s", this.nomeCliente.getName()));
		System.out.println (String.format("Agência: %s", this.agencia));
		System.out.println (String.format("Número da Conta: %d", this.numeroConta));
		System.out.println (String.format("Saldo: %.2f", this.saldo));
	}

}
