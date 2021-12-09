
public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario();
		
		try{
			f1.aumentaSalario(-1000);
		}catch(IllegalArgumentException e){
			System.out.println("Houve uma IllegalArgumentException ao aumentar o Salario ");
		}
	}
}
