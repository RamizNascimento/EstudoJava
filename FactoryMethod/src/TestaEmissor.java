
public class TestaEmissor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmissorCreator creator = new EmissorCreator();
		
		Emissor emissor1 = creator.create(EmissorCreator.SMS);
		emissor1.envia("k19 -treinamentos enviando via sms!!!");
		
		Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
		emissor2.envia("k19 - treinamentos enviando via e-mail");
		
		Emissor emissor3 = creator.create(EmissorCreator.JMS);
		emissor3.envia("k19 - Treinamentos enviando via e-mail");		
				
	}

}
