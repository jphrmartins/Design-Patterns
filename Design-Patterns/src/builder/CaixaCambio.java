package builder;

import java.util.List;

public class CaixaCambio {

	private int numeroMarcha;
	private List<Parafuso> parafusos;

	public CaixaCambio(int numeroMarcha, List<Parafuso> parafusos) {
		this.numeroMarcha = numeroMarcha;
		this.parafusos = parafusos;
	}

	public int getNumeroMarcha() {
		return numeroMarcha;
	}

	public List<Parafuso> getParafusos() {
		return parafusos;
	}

}
