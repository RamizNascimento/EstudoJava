import java.io.InputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ExcercicioLerTecladoImprimeArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream fonteDadosCMD = System.in;
		Scanner scanner = new Scanner(fonteDadosCMD);
		
		FileOutputStream destinoDadosArquivo = new FileOutputStream("saida.txt");
		PrintStream printStream = new PrintStream(destinoDadosArquivo);
		
		while(scanner.hasNextLine()){
			String linha = scanner.nextLine();
			printStream.println(linha);
		}
	}

}
