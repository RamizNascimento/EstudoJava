
public class TesteRecibo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeradorDeArquivo geradorDeAquivoTXT = new GeradorDeArquivTXT();
		Recibo recibo = new Recibo("K19 Treinamentos", "Marcelo Martins", 1000, geradorDeAquivoTXT);
		recibo.geraArquivo();
	}

}
