package observer;


public class Jp extends Observer {
	
	public Jp(Subject subject) {
		this.subject = subject;
		this.subject.adicionaObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Jp observou ->" + this.subject.getState());
	}

}
