
public class VisaComunicadorFactory implements ComunicadorFactory {

	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	
	@Override
	public Emissor createEmissor() {
		// TODO Auto-generated method stub
		return emissorCreator.create(EmissorCreator.VISA);
	}

	@Override
	public Receptor createReceptor() {
		// TODO Auto-generated method stub
		return receptorCreator.create(ReceptorCreator.VISA);
	}

}
