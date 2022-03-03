
public class Main {

	public static void main(String[] args){
		
		Cliente jennifer = new Cliente();
		jennifer.setName("Jennifer");
		
		Conta cc = new ContaCorrente(jennifer);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(jennifer);
		
		cc.transferir(100, cp);

		
		System.out.println();
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
