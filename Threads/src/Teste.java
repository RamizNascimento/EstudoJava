
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TarefaImprimeMensagens tarefa1 = new TarefaImprimeMensagens("k19");
		TarefaImprimeMensagens tarefa2 = new TarefaImprimeMensagens("Java");
		TarefaImprimeMensagens tarefa3 = new TarefaImprimeMensagens("Web");
	
		Thread thread1 = new Thread(tarefa1);
		Thread thread2 = new Thread(tarefa2);
		Thread thread3 = new Thread(tarefa3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
