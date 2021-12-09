import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Distribuidor distribuidor = new Distribuidor();
		
		ServerSocket serverSocket = new ServerSocket(10000);
		
		Registrador registrador = new Registrador(distribuidor, serverSocket);
		
		Thread pilha = new Thread(registrador);
		
		pilha.start();
	}

}
