
public class EmissorMastercard implements Emissor {

	@Override
	public void envia(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Enviando a seguinte mensagem para a Mastercard:");
		System.out.println(mensagem);
	}

}
