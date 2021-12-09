
public class EmissorJMS implements Emissor {

	@Override
	public void envia(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Enviando a mensagem via JMS");
		System.out.println(mensagem);
	}

}
