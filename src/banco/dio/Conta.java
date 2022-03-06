package banco.dio;

public class Conta {

	double saldo;

	// fun��o depositar
	public void Depositar(double valor) {
		saldo += valor;
	}

	// fun��o saldo
	public void Saldo() {
		System.out.printf("Seu saldo � de: R$%.2f\n", saldo);
	}

	// fun��o tranferencia
	public void Transferencia(double valor) {
		saldo -= valor;
	}

	// fun��o sacar
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
