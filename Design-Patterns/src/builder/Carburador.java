package builder;

import java.util.List;

public class Carburador {

	private List<Parafuso> parafusos;
	private double potencia;
	
	public Carburador(List<Parafuso> parafusos, double potencia) {
		this.parafusos = parafusos;
		this.potencia = potencia;
	}

	public List<Parafuso> getParafusos() {
		return parafusos;
	}

	public double getPotencia() {
		return potencia;
	}

}
