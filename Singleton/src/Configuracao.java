import java.util.HashMap;
import java.util.Map;


public class Configuracao {
	
	private Map<String, String> propriedade;
	private static Configuracao instance;
	
	private Configuracao(){
		this.propriedade = new HashMap<String, String>();
		this.propriedade.put("time-zone", "America/Sao_Paulo");
		this.propriedade.put("currency-code", "BRL");
	}
	
	public static Configuracao getInstance(){
		
		if( Configuracao.instance == null ){
			Configuracao.instance = new Configuracao();
		}
		
		return Configuracao.instance;
	}
	
	public String getPropriedade(String nomeDaPropriedade){
		return this.propriedade.get(nomeDaPropriedade);
	}
}

	
