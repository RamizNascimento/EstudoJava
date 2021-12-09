
public class EmissorEMAIL implements Emissor {

	@Override
	public void envia(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Envia a mensagem via E-mail");
		System.out.println(mensagem);
	}

}
