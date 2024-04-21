package reservation_system;

import reservation_system.users.controller.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubscriptionManager {

	private HashMap<Subject, List<Observer>> subscriptions;
	private static SubscriptionManager instance;

	public SubscriptionManager() {}

	/**
	 * 
	 * @param o
	 */
	public void attach(Observer o, Subject s) {

		if(subscriptions.get(s) != null) {
			subscriptions.get(s).add(o);
		} else {
			List<Observer> observers = new ArrayList<>();
			observers.add(o);
			subscriptions.put(s, observers);
		}
	}

	/**
	 * 
	 * @param o
	 */
	public void detach(Observer o, Subject s) {
		List<Observer> observers = subscriptions.get(s);
		observers.remove(o);
		if(observers.isEmpty()) subscriptions.remove(s);
	}

	public void notify(Subject s) {
		List<Observer> observers = subscriptions.get(s);

		for(Observer o : observers) {
			o.update(s);
		}
	}

	public SubscriptionManager getInstance() {
		if(instance == null) instance = new SubscriptionManager();

		return instance;
	}
}