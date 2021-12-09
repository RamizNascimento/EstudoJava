import java.util.Scanner;


public class ReceptorDeMensagem implements Runnable {

	private Scanner entrada;
	
	private Telak19Chat telaK19Chat;
	
	public ReceptorDeMensagem(Scanner entrada, Telak19Chat telaK19chat){
		this.entrada = entrada;
		this.telaK19Chat = telaK19Chat;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(this.entrada.hasNextLine()){
			String mensagem =this.entrada.nextLine();
			this.telaK19Chat.adicionaMensagem(mensagem);
		}
	}
}
