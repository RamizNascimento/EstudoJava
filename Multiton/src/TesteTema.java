
public class TesteTema {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tema temaFire = Tema.getInstance(Tema.FIRE);
		System.out.println("Tema: " + temaFire.getNome());
		System.out.println("Cor Da Fonte: " + temaFire.getCorDaFonte());
		System.out.println("Cor do Fundo: " + temaFire.getCorDoFundo());
		
		Tema temaFire2 = Tema.getInstance(Tema.FIRE);
		
		System.out.println("--------------------");
		System.out.println("Comparando as referências ....");
		System.out.println(temaFire == temaFire2);
	}

}
