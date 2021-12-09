import java.util.Calendar;


public class GeradorDeBoleto {
	private BoletoBuilder boletoBuilder;
	
	public GeradorDeBoleto(BoletoBuilder boletoBuilder){
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto geraBoleto(){
		
		this.boletoBuilder.buildSacado("Ramiz Augusto");
		
		this.boletoBuilder.buildCedente("k19 - Treinamentos");
		
		this.boletoBuilder.buildValor(2744.90);
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		this.boletoBuilder.buildVencimento(vencimento);
		
		this.boletoBuilder.buildNossoNumero(9913);
		
		Boleto boleto = boletoBuilder.getBoleto();
		
		return boleto;
		
	}
}
