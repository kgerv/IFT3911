package ReservationSystem;

import ReservationSystem.User.Observer.Observer;

public class SubscriptionManager {

	private Hashtable<Observer> subscription;
	private static SubscriptioManager instance;

	/**
	 * 
	 * @param o
	 */
	public void attach(Observer o) {
		// TODO - implement ReservationSystem.SubscriptionManager.attach
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param o
	 */
	public void detach(Observer o) {
		// TODO - implement ReservationSystem.SubscriptionManager.detach
		throw new UnsupportedOperationException();
	}

	public void notify() {
		// TODO - implement ReservationSystem.SubscriptionManager.notify
		throw new UnsupportedOperationException();
	}

	public static SubscriptionManager getInstance() {
		// TODO - implement ReservationSystem.SubscriptionManager.getInstance
		throw new UnsupportedOperationException();
	}

}