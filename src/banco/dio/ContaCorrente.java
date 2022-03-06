package banco.dio;

public class ContaCorrente extends Conta {
	public ContaCorrente(double saldo, String cliente, int numeConta, int numAgencia) {
		super(saldo, cliente, numeConta, numAgencia);
		// TODO Auto-generated constructor stub
	}

	Cliente cliente = new Cliente();

	// Extrato conta corrente
	public void ExtratoCorrente() {
		cliente.DadosCliente();
		super.Saldo();

	}

}
