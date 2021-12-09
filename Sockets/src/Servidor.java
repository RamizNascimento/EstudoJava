import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = new ServerSocket(10000);
		
		Socket socket = serverSocket.accept();
		
		PrintStream saida = new PrintStream(socket.getOutputStream());
	
		saida.println("Você se conectou ao servidor da k19");
	}

}
