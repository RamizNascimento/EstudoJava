
public class TetaCaminho {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trecho trecho1 = new TrechoAndando("Vá até o cruzamento da Avenida Rebouças com a Avenida Brigadeiro Faria Lima",500);
		
		Trecho trecho2 = new TrechoAndando("Vá até o cruzamento da Avenida Brigadeiro Faria Lima com a Avenida Cidade Jardim",1500);
		
		Trecho trecho3 = new TrechoAndando("Vire á direita na Marginal Tiete",500);
		
		Caminho caminho1 = new Caminho();
		
		caminho1.adiciona(trecho1);
		caminho1.adiciona(trecho2);
		
		System.out.println("Caminho 1 : ");
		caminho1.imprime();
		
		Caminho caminho2 = new Caminho();
		caminho2.adiciona(caminho1);
		caminho2.adiciona(trecho3);
		System.out.println("---------------------");
		System.out.println("Caminho 2 : ");
		caminho2.imprime();
		
		
	}

}
