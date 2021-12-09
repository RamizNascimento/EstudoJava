
public class ReceptorMastercard implements Receptor {

	@Override
	public String recebe() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem da Mastercard");
		String mensagem = "Mensagem da Mastercard";
		return mensagem;
	}

}
