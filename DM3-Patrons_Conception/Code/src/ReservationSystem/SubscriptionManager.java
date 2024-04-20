package ReservationSystem;

import ReservationSystem.Users.Observers.Observer;
import java.util.HashMap;
import java.util.List;


public class SubscriptionManager {

	private HashMap<Integer,Observer> subscription;
	private static SubscriptionManager instance;
	private int nextId = 0;
	/**
	 * 
	 * @param o
	 */
	public void attach(Observer o) {
		int id = nextId++;
        subscription.put(id, o);
	}

	/**
	 * 
	 * @param o
	 */
	public void detach(Observer o) {
		//supprimer la valeur de l'objet o dans la liste de subscription.

		subscription.remove(o);
	}

	public void notify() {
		//Notifier tous les observateurs
		for (Observer o : subscription.values()) {
			o.update();
		}
	}

	public static SubscriptionManager getInstance() {
		if (instance == null) {
			instance = new SubscriptionManager();
		}
		return instance;
	}

}