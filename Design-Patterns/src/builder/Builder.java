package builder;

public class Builder {

	public static void main(String[] args) {
		Motor motor = Motor.builder()
				.comCaixaCambio(5)
				.comCarburador(120)
				.comCorreias(2)
				.build();
		System.out.println(motor.getPontencia());

		Motor motorComTurbo = Motor.builder()
				.comCaixaCambio(5)
				.comCarburador(120)
				.comCorreias(2)
				.comTurbo(20)
				.build();
		System.out.println(motorComTurbo.getPontencia());
	}
}
