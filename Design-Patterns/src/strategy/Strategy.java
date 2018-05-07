package strategy;

import java.math.BigDecimal;

public class Strategy {

	public static void main(String[] args) {
		CalculadoraImposto calculadora = new CalculadoraImposto();
		BigDecimal imposto = calculadora.calcular(new IPVA(), "100");
		System.out.println("Valor de imposto -> " + imposto);
		
	}
}
