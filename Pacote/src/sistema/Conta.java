package sistema;

public class Conta {
	
	//Atributos
	private double saldo;
	
	//M�todos
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
}
