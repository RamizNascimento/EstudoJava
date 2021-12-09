
public class TestaMastercardComunicadorFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComunicadorFactory comunicadorFactory = new MastercardComunicadorFactory();
		
		String transacao = "Valor=R$500,00; senha=****";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}

}