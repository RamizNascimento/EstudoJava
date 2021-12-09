
public class EmissorSMS implements Emissor {

	@Override
	public void envia(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Enviando por a mensagem por SMS");
		System.out.println(mensagem);
	}

}
