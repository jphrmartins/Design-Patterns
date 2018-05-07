package factorymethod;

public class AirBus implements AviaoFactory{

	@Override
	public Aviao constroiAviao() {
		return new A380();
	}

}
