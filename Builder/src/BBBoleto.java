import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.lang.StringBuilder;

public class BBBoleto implements Boleto {
	
	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;
	
	public BBBoleto( String sacado, String cedente, double valor, Calendar vencimento, int nossoNumero){
		
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
	}
		
	@Override
	public String getSacado() {
		// TODO Auto-generated method stub
		return this.sacado;
	}

	@Override
	public String getCedente() {
		// TODO Auto-generated method stub
		return this.cedente;
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return this.valor;
	}

	@Override
	public Calendar getVencimento() {
		// TODO Auto-generated method stub
		return this.vencimento;
	}

	@Override
	public int getNossoNumero() {
		// TODO Auto-generated method stub
		return this.nossoNumero;
	}
	
	public String toString(){
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Boleto BB");
		stringBuilder.append("\n");
		
		stringBuilder.append("Sacado: " + this.sacado);
		stringBuilder.append("\n");
		
		stringBuilder.append("Cedente: " + this.cedente);
		stringBuilder.append("\n");
		
		stringBuilder.append("Valor: " + this.valor);
		stringBuilder.append("\n");
		
		stringBuilder.append("Vencimento: " + this.sacado);
		stringBuilder.append("\n");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String format = simpleDateFormat.format(this.vencimento.getTime());
		stringBuilder.append("Vencimento: " + format);
		stringBuilder.append("\n");
		
		stringBuilder.append("Nosso Número: " +  this.nossoNumero);
		stringBuilder.append("\n");
		
		return stringBuilder.toString();
	}

	

}
