package banco.dio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Conta conta = new Conta(0, "", 0, 0);
		ContaPoupanca poupanca = new ContaPoupanca(0, null, 0, 0);
		ContaCorrente corrente = new ContaCorrente(0, null, 0, 0);

		double valor = 0;
		int opcao = 0;
		int escolha;

		do {

			System.out.println("Qual o tipo de conta deseja acessar? \n1 - Conta corrente \\n2 - Conta corrente");
			escolha = scan.nextInt();

			if (escolha == 1) {

				do {

					System.out.println(
							"\n\nAgora, o que deseja fazer? \n1 - Saque \n2 - Deposito \n3 - Transferencia \n4 - Extrato \n0 - Encerrar");
					opcao = scan.nextInt();

					switch (opcao) {
					case 1:
						System.out.println("Qual será o valor do saque? ");
						valor = scan.nextDouble();
						conta.Saque(valor);
						break;

					case 2:
						System.out.println("Qual será o valor do depoisito? ");
						valor = scan.nextDouble();
						conta.Depositar(valor);
						break;

					case 3:
						System.out.println("Qual será o valor da transferência? ");
						valor = scan.nextDouble();
						conta.Transferencia(valor);
						break;

					case 4:
						corrente.ExtratoCorrente();
						break;

					}
				} while (opcao != 0);

			} else if (escolha == 2) {

				do {

					System.out.println(
							"\n\nAgora, o que deseja fazer? \n1 - Saque \n2 - Deposito \n3 - Transferencia \n4 - Extrato \n0 - Encerrar");
					opcao = scan.nextInt();

					switch (opcao) {
					case 1:
						System.out.println("Qual será o valor do saque? ");
						valor = scan.nextDouble();
						conta.Saque(valor);
						break;

					case 2:
						System.out.println("Qual será o valor do depoisito? ");
						valor = scan.nextDouble();
						conta.Depositar(valor);
						break;

					case 3:
						System.out.println("Qual será o valor da transferência? ");
						valor = scan.nextDouble();
						conta.Transferencia(valor);
						break;

					case 4:
						poupanca.ExtratoPoupanca();
						break;

					}
				} while (opcao != 0);

			}

		} while (escolha > 2);

		scan.close();

		System.out.println("\nObrigado por usar nossos serviços tenha um bom dia!");

	}

}
