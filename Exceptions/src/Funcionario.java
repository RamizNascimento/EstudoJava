
public class Funcionario {
	//Atributos
	private double salario;
	
	//Método
	public void aumentaSalario(double aumento){
		if(aumento < 0){
			IllegalArgumentException error = new IllegalArgumentException();
			throw error;
		}
	}
}
