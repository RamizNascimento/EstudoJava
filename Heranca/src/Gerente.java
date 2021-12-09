
public class Gerente extends Funcionario {
	// Atributos
	private String usuario;
	private String senha;
	
	//Métodos
	public void mostraDados(){
		System.out.println("Dados Base do Funcionario");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Bonificacao: " + this.calculaBonificacao());
		System.out.println("Usuario: " + this.getUsuario());
		System.out.println("Senha: " + this.getSenha());
	}
	
	public double calculaBonificacao(){
		return this.getSalario() * 0.6 + 100;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public String getUsuario() {
		return this.usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
