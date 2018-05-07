package observer;

public class Pedro extends Observer {

	public Pedro(Subject subject) {
		this.subject = subject;
		this.subject.adicionaObserver(this);
	}
	@Override
	public void update() {
		System.out.println("Pedro Observou -> " + this.subject.getState());
	}

}
