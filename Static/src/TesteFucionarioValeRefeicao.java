import java.util.Scanner;

public class TesteFucionarioValeRefeicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		System.out.println("Vale Refei��o do funcionario 1: " + f1.valeRefeicaoDiario);
		System.out.println("Vale Refei��o do funcionario 2: " + f2.valeRefeicaoDiario);
		
		Funcionario.valeRefeicaoDiario = 1000;
		
		System.out.println("Dados do vale Refei��o Atualizados");
		
		System.out.println("Vale Refei��o do funcionario 1: " + f1.valeRefeicaoDiario);
		System.out.println("Vale Refei��o do funcionario 2: " + f2.valeRefeicaoDiario);
		
		System.out.println("Por favor digite a taxa a ser aplicada no reajuste do valor do vale refei�ao");
		Scanner d = new Scanner(System.in);
		double taxa = d.nextDouble();
		
		Funcionario.atualizaValeRefeicaoDiario(taxa);
	}

}
