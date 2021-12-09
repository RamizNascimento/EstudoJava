
public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g = new Gerente();
		g.setNome("Rafael Consentino");
		g.setSalario(2000);
		g.setUsuario("rafael.consentino");
		g.setSenha("1234");

		Telefonista t = new Telefonista();
		t.setNome("Carolina Mello");
		t.setSalario(1000);
		t.setEstacaoDeTrabalho(13);
		
		Secretaria s = new Secretaria();
		s.setNome("Tatiane Andrade");
		s.setSalario(1500);
		s.setRamal(198);
	
		System.out.println("GERENTE");
		g.mostraDados();	
		
		System.out.println("TELEFONISTA");
		t.mostraDados();		
		
		System.out.println("SECRETARIA");
		s.mostraDados();					
	}
}
