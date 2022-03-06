package banco.dio;

public class Conta {

	double saldo;

	// função depositar
	public void Depositar(double valor) {
		saldo += valor;
	}

	// função saldo
	public void Saldo() {
		System.out.printf("Seu saldo é de: R$%.2f\n", saldo);
	}

	// função tranferencia
	public void Transferencia(double valor) {
		saldo -= valor;
	}

	// função sacar
	public void Saque(double valor) {
		saldo -= valor;
	}

	// definindo construtores
	public Conta(double saldo, String cliente, int numeConta, int numAgencia) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
