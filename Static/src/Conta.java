
public class Conta {
	// Atributo da classe
	static int contador;
	
	//Atributo de instancia
	int numero;
	
	//Construtor
	Conta(){
		Conta.contador++;
		this.numero = Conta.contador;
	}
	
	static void zeraContador(){
		System.out.println("Contador: " + Conta.contador);
		System.out.println("Zerando o contador de contas...");
		Conta.contador = 0;
	}
}
