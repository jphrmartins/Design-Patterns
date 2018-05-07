package factorymethod;

public class Legacy implements Aviao {

	@Override
	public int getNumeroTurbinas() {
		return 2;
	}

	@Override
	public int getNumeroPoltronas() {
		return 9;
	}

	@Override
	public String getNome() {
		return "Legacy 600";
	}

}
