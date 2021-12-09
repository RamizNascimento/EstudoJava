import java.io.FileNotFoundException;
import java.io.PrintStream;


public class GeradorDeArquivTXT implements GeradorDeArquivo {

	@Override
	public void gera(String conteudo) {
		// TODO Auto-generated method stub
		try{
			PrintStream saida = new PrintStream("arquivo.txt");
			saida.println(conteudo);
			saida.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
