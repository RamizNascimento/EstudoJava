
public abstract class Funcionario {
	//Atributos
	private double salario;
	private String nome;
	
	//M�todos
	public double getSalario() {
		return salario;
	}
	public String getNome() {
		return nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//M�todos Abstratos
	public abstract double bonificacao();
}
