package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<>();
	private String state;
	
	public void adicionaObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	public void setState(String state) {
		this.state = state;
		notificaObservers();
	}

	public String getState() {
		return state;
	}

	private void notificaObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
