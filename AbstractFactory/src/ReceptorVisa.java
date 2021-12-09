
public class ReceptorVisa implements Receptor {

	@Override
	public String recebe() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem da Visa.");
		String mensagem = "Mensagem da Visa!";
		return mensagem;
	}

}
