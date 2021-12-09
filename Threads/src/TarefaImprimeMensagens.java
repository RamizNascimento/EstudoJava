
public class TarefaImprimeMensagens implements Runnable {
	
	private String msg;
	
	public TarefaImprimeMensagens(String msg){
		this.msg = msg;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 100; i++){
			System.out.println(i + ": " + this.msg);
		}
	}

}
