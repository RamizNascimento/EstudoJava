
public class Funcionario {
	// Atributo de classe
	static double valeRefeicaoDiario = 0;
	
	// M�todos da classe
	static void atualizaValeRefeicaoDiario(double taxa){
		Funcionario.valeRefeicaoDiario += Funcionario.valeRefeicaoDiario * taxa;
		System.out.println("Vale Refei��o Di�rio atualizado para -> " + Funcionario.valeRefeicaoDiario);
	}
}
