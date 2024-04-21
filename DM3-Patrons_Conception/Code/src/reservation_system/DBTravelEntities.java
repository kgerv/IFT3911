package reservation_system;

import reservation_system.travel_entities.TravelEntity;


import java.util.HashMap;

public class DBTravelEntities extends Subject {
	private SubscriptionManager subscriptionManager = new SubscriptionManager().getInstance();
	private HashMap<String, TravelEntity> db;

	public HashMap<String, TravelEntity> getState() {
		return db;
	}
	
	public void setState(HashMap<String, TravelEntity> db) {
		this.db = db;
		subscriptionManager.notify();
	}
}