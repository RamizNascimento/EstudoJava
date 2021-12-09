
public class ReceptorCreator {
	
	public static final int VISA = 0;
	public static final int Mastercard = 1;
	
	public Receptor create( int tipoDoReceptor){
		
		if( tipoDoReceptor == ReceptorCreator.VISA ){
			return new ReceptorVisa();
		
		} else if( tipoDoReceptor == ReceptorCreator.Mastercard ){
			return new ReceptorMastercard();
			
		} else {
			throw new IllegalArgumentException("Tipo de receptor não suportado");
			
		}
	}
}
