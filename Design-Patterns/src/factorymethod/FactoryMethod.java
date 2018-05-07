package factorymethod;

public class FactoryMethod {

	public static void main(String[] args) {
		AviaoFactory factory = new Embraer();
		
		Aviao aviao = factory.constroiAviao();
		
		System.out.println(aviao.getNome());
		System.out.println(aviao.getNumeroPoltronas());
		System.out.println(aviao.getNumeroTurbinas());
	}
}
