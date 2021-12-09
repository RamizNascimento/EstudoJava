import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class EscritaDeArquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Classe Destino dos dados
		FileOutputStream arquivo = new FileOutputStream("saida.txt");
		
		// Classe que envia ou escreve ou imprime os dados
		PrintStream printSream = new PrintStream(arquivo);
		
		printSream.println("Quinta Linha!!!!!");
		printSream.println("Quarta Linha!!!!!");
		printSream.println("Terceira Linha!!!!!");
	}

}
