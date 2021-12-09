package teste;

import sistema.Conta;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new Conta();
		c1.deposita(1000);
		
		System.out.println(c1.getSaldo());
	}

}
