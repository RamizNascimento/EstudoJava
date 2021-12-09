
public class ContaPoupanca implements Conta {
	//Atributos
	private double saldo;

	//Métodos Implementados
	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		// TODO Auto-generated method stub
		this.saldo -= valor;
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

}
