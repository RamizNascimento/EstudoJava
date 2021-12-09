
public class Secretaria extends Funcionario {
	// Atributos
	private int ramal;
	
	// Métodos
	public void mostraDados(){
		System.out.println("Dados Base do Funcionario");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Bonificacao: " + this.calculaBonificacao());
		System.out.println("Ramal: " + this.getRamal());
	}
	
	public int getRamal() {
		return this.ramal;
	}
	
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
}
