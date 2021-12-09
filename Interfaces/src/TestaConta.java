
public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente c1 = new ContaCorrente();
		ContaPoupanca c2 = new ContaPoupanca();
		
		c1.deposita(500);
		c2.deposita(500);
		
		geradorDeExtrato g = new geradorDeExtrato();
		g.geraExtrato(c1);
		g.geraExtrato(c2);
	}

}
