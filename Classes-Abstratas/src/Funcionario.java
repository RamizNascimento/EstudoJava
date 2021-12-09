
public abstract class Funcionario {
	//Atributos
	private double salario;
	private String nome;
	
	//Métodos
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
	//Métodos Abstratos
	public abstract double bonificacao();
}
