import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class ExercicioLeituraEscrita {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Classe que cria o objeto fonte dos dados a serem lidos
		InputStream fonteDados = new FileInputStream("entrada.txt");
	
		//Classe que cria o objeto que le a fonte de dados, no caso o objeto da fonte de dados
		Scanner leitorDados = new Scanner(fonteDados);
		
		
		
		//Classe que cria o objeto destino dos dados recebidos
		FileOutputStream destinoDados = new FileOutputStream("saida.txt");
		
		//Classe que envia ou escreve os dados recebidos no objeto destino
		PrintStream escritorDados = new PrintStream(destinoDados);
		
		
		//Lendo dados da fonte de dados utilizando métodos do objeto que leitor de fonte de dados e escrevendo no destino 
		while(leitorDados.hasNextLine()){
			String linhaTexto = leitorDados.nextLine();
			escritorDados.println(linhaTexto);
			System.out.println("Arquivo saida.txt: " + linhaTexto);
		}
	}

}
