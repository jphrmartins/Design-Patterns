package factorymethod;

public class A380 implements Aviao {

	@Override
	public int getNumeroTurbinas() {
		return 4;
	}

	@Override
	public int getNumeroPoltronas() {
		return 504;
	}

	@Override
	public String getNome() {
		return "A-380 Heavy";
	}

}
