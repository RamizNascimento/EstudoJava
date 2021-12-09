import java.util.Calendar;


public class BBBoletoBuilder implements BoletoBuilder {

	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;
	
	@Override
	public void buildSacado(String sacado) {
		// TODO Auto-generated method stub
		this.sacado = sacado;
	}
	@Override
	public void buildCedente(String cedente) {
		// TODO Auto-generated method stub
		this.cedente = cedente;
	}
	@Override
	public void buildValor(double valor) {
		// TODO Auto-generated method stub
		this.valor = valor;
	}
	@Override
	public void buildVencimento(Calendar vencimento) {
		// TODO Auto-generated method stub
		this.vencimento = vencimento;
	}
	@Override
	public void buildNossoNumero(int nossoNumero) {
		// TODO Auto-generated method stub
		this.nossoNumero = nossoNumero;
	}
	@Override
	public Boleto getBoleto() {
		// TODO Auto-generated method stub
		return new BBBoleto( sacado, cedente, valor, vencimento, nossoNumero);
	}
	
	

}
