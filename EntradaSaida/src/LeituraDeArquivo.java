import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class LeituraDeArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//Class de Fonte de dados
		InputStream arquivo = new FileInputStream("entrada.txt");
		
		//Classe do leitor de fontes
		Scanner scanner = new Scanner(arquivo);
		
		//utilizando métodos do leitor de fonte
		while(scanner.hasNextLine()){
			String linha = scanner.nextLine();
			System.out.println(linha);
		}
	}
}
