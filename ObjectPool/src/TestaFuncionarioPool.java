
public class TestaFuncionarioPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pool<Funcionario> funcionarioPool = new FuncionarioPool();
		Funcionario funcionario = funcionarioPool.acquire();
		
		while( funcionario != null ){
			System.out.println(funcionario.getNome());
			funcionario = funcionarioPool.acquire();
		}
	}

}
