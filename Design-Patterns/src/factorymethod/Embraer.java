package factorymethod;

public class Embraer implements AviaoFactory {

	@Override
	public Aviao constroiAviao() {
		return new Legacy();
	}

}
