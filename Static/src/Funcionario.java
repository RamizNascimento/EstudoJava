
public class Funcionario {
	// Atributo de classe
	static double valeRefeicaoDiario = 0;
	
	// Métodos da classe
	static void atualizaValeRefeicaoDiario(double taxa){
		Funcionario.valeRefeicaoDiario += Funcionario.valeRefeicaoDiario * taxa;
		System.out.println("Vale Refeição Diário atualizado para -> " + Funcionario.valeRefeicaoDiario);
	}
}
