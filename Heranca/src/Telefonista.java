
public class Telefonista extends Funcionario{
	// Método
	private int estacaoDeTrabalho;
	
	// Métodos
	public void mostraDados(){
		System.out.println("Dados Base do Funcionario");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Bonificacao: " + this.calculaBonificacao());
		System.out.println("Estacao de Trabalho: " + this.getEstacaoDeTrabalho());
	}
	
	public int getEstacaoDeTrabalho() {
		return this.estacaoDeTrabalho;
	}
	
	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}
}
