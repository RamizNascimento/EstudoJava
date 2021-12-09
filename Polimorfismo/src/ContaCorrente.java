
public class ContaCorrente extends Conta {
	// Atributos
	private double limite;
	
	// Métodos
	public void setLimite(double valor){
		this.limite = valor;
	}
	
	public double getLimite(){
		return this.limite;
	}
}
