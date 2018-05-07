package strategy;

import java.math.BigDecimal;

public interface ImpostoStrategy {

	BigDecimal calcular(String valor);
}
