
public class Gerente extends Funcionario {
	private String usu�rio;
	private String senha;
	
	@Override
	public double bonificacao() {
		return getSalario() * 0.4;
		// TODO Auto-generated method stub
	}
}
