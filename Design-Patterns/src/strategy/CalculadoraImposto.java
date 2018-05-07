package strategy;

import java.math.BigDecimal;

public class CalculadoraImposto {

	public BigDecimal calcular (ImpostoStrategy imposto, String valor) {
		return imposto.calcular(valor);
	}
}
