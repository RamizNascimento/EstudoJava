
public class Gerente extends Funcionario {
	private String usuário;
	private String senha;
	
	@Override
	public double bonificacao() {
		return getSalario() * 0.4;
		// TODO Auto-generated method stub
	}
}
