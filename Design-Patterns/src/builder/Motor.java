package builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Motor {

	private Carburador carburador;
	private CaixaCambio caixaCambio;
	private List<Correia> correias;
	private double pontencia;
	private Turbo turbo;

	private Motor(Carburador carburador, CaixaCambio caixaCambio, List<Correia> correias, double pontencia,
			Turbo turbo) {
		this.carburador = carburador;
		this.caixaCambio = caixaCambio;
		this.correias = correias;
		this.pontencia = pontencia;
		this.turbo = turbo;
	}

	public Carburador getCarburador() {
		return carburador;
	}

	public CaixaCambio getCaixaCambio() {
		return caixaCambio;
	}

	public List<Correia> getCorreias() {
		return correias;
	}

	public double getPontencia() {
		return pontencia;
	}

	public Turbo getTurbo() {
		return turbo;
	}
	
	public static MotorBuilder builder() {
		return new MotorBuilder();
	}
	
	public static class MotorBuilder {
		private Carburador carburador;
		private CaixaCambio caixaCambio;
		private List<Correia> correias;
		private Turbo turbo;
		
		private MotorBuilder() {}

		public MotorBuilder comCarburador(double potencia) {
			this.carburador = new Carburador(Arrays.asList(new Rosca(), new Rosca(), new CabecaChata(), new Rosca()), potencia);
			return this;
		}
		
		public MotorBuilder comCaixaCambio(int numeroMarchas) {
			this.caixaCambio = new CaixaCambio(6, Arrays.asList(new CabecaChata(), new CabecaChata(), new CabecaChata(), new CabecaChata()));
			return this;
		}
		
		public MotorBuilder comCorreias(double numeroCorreia) {
			this.correias = new ArrayList<>();
			for(int i =0; i < numeroCorreia; i++) {
				this.correias.add(new CorreiaChata());
			}
			return this;
		}
		
		public MotorBuilder comTurbo (double potencia) {
			if(potencia > 10) {
				this.turbo = new Turbo(Arrays.asList(new Rosca(), new Rosca(), new Rosca(), new Rosca()), potencia);
			} else {
				this.turbo = new Turbo(Arrays.asList(new Rosca(), new Rosca(), new Rosca(), new Rosca()), 10);
			}
			return this;
		}
		
		public Motor build() {
			if(ValidaConstrucao()) {
				double potencia = this.carburador.getPotencia();
				if(turboExists()) {
					potencia *= this.turbo.getPotencia();
					return new Motor(carburador, caixaCambio, correias, potencia, turbo);
				}
				return new Motor(carburador, caixaCambio, correias, potencia, turbo);
			}
			throw new MotorInvalidoException();
		}

		private boolean turboExists() {
			return this.turbo != null;
		}

		private boolean ValidaConstrucao() {
			return (this.caixaCambio != null && this.caixaCambio.getNumeroMarcha() >= 3) && 
					(this.carburador != null && this.carburador.getPotencia() >= 7) && 
					(this.correias != null && this.correias.size() >= 1);
		}
	}
}
