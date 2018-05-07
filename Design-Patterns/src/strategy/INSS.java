package strategy;

import java.math.BigDecimal;

public class INSS implements ImpostoStrategy {

	@Override
	public BigDecimal calcular(String valor) {
		System.out.println("Imposto -> INSS");
		BigDecimal imposto = new BigDecimal(valor);
		return imposto.multiply(new BigDecimal("0.5"));
	}

}
