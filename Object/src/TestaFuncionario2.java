
public class TestaFuncionario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Ramiz");
		f1.setSalario(2500);
		
		Funcionario f2 = new Funcionario();
		
		f2.setNome("Vinicius");
		f2.setSalario(1500);
	
		System.out.println(f1 == f2);
		System.out.println(f1.equals(f2));
	}

}
