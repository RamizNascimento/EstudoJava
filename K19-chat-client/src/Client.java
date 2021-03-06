import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1",10000);
		
		PrintStream saida = new PrintStream(socket.getOutputStream());
		
		Scanner entrada = new Scanner(socket.getInputStream());
		
		EmissorDeMensagem emissor = new EmissorDeMensagem(saida);
		
		Telak19Chat telaK19Chat = new Telak19Chat(emissor);
		
		ReceptorDeMensagem receptor =new ReceptorDeMensagem(entrada,telaK19Chat);
		
		Thread pilha = new Thread(receptor);
		
		pilha.start();
	}

}
