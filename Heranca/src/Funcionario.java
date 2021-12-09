
public class Funcionario {
	//Atributos
	private String nome;
	private double salario;
	
	//Métodos
	public void mostraDados(){
		System.out.println("Dados Base do Funcionario");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Bonificacao: " + this.calculaBonificacao());
	}
	
	public double calculaBonificacao(){
		return this.salario * 0.1;
	}
	
	public void setNome(String texto){
		this.nome = texto;
	}
	
	public void setSalario(double valor){
		this.salario = valor;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public double getSalario(){
		return this.salario;
	}
}
