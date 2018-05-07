package strategy;

import java.math.BigDecimal;

public class IPVA implements ImpostoStrategy{

	@Override
	public BigDecimal calcular(String valor) {
		System.out.println("Imposto -> IPVA");
		return new BigDecimal(valor).multiply(new BigDecimal("0.2"));
	}

}
