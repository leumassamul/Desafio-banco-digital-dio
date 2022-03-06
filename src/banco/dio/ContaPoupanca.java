package banco.dio;

public class ContaPoupanca extends Conta{
	
	Cliente cliente = new Cliente();
	

	public ContaPoupanca(double saldo, String cliente, int numeConta, int numAgencia) {
		super(saldo, cliente, numeConta, numAgencia);
		// TODO Auto-generated constructor stub
	}
	
	
	//Extrato Conta Poupança	
	public void ExtratoPoupanca() {	
		cliente.DadosCliente();
		super.Saldo();
		
	}

	
	
	
	
	
	

}
