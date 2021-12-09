
public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente f1 = new Gerente();
		
		f1.setNome("Ramiz");
		f1.setSalario(2500);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getSalario());
		System.out.println(f1.bonificacao());
	}

}
