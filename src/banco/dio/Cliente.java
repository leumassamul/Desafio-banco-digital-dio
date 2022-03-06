package banco.dio;

public class Cliente {
	
	String nome = "Antonio João das Couves";                //Definindo como final apenas para facilitar o retorno com o uso de uma variavel de valor fixo
	final int agencia = 123;   								//Definindo como final apenas para facilitar o retorno com o uso de uma variavel de valor fixo
	final int conta = 1234567; 								//Definindo como final apenas para facilitar o retorno com o uso de uma variavel de valor fixo
	
	public void DadosCliente() {
		
		System.out.println("Cliente: " + nome + "\nAgencia: " + agencia + "\nConta: " + conta);
	}
		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public int getAgencia() {
		return agencia;
	}

	

}
