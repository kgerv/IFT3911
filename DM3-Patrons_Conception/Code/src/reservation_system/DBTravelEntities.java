package reservation_system;

import reservation_system.travel_entities.TravelEntity;
import reservation_system.visitor.Visitable;
import reservation_system.visitor.Visitor;

import java.util.HashMap;

public class DBTravelEntities extends Subject {

	public DBTravelEntities() {

	}

	private HashMap<String, TravelEntity> db;

	public HashMap<String, TravelEntity> getState() {
		// TODO - implement ReservationSystem.DBTravelEntities.getState
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param db
	 */
	public void setState(HashMap<String, TravelEntity> db) {
		// TODO - implement ReservationSystem.DBTravelEntities.setState
		throw new UnsupportedOperationException();
	}
}