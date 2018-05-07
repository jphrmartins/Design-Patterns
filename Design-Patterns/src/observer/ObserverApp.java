package observer;

public class ObserverApp {
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		subject.setState("Estado 1");
		
		Observer jp = new Jp(subject);
		
		subject.setState("Estado 2");
		
		Observer pedro = new Pedro(subject);
		
		subject.setState("Estado 3");
	}
}
