
public class TrechoAndando implements Trecho {

	private String direcao;
	private double distancia;
	
	public TrechoAndando(String direcao, double distancia){
		this.direcao = direcao;
		this.distancia = distancia;
	}
	
	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("Vá andando: ");
		System.out.println(this.direcao);
		System.out.println("A distancia percorrida será de: " + this.distancia + "metros.");
	}

}
