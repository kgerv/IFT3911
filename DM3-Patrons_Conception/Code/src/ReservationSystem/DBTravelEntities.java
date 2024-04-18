package ReservationSystem;

import ReservationSystem.TravelEntities.TravelEntity;
import ReservationSystem.Visitor.Visitable;
import ReservationSystem.Visitor.Visitor;

import java.util.HashMap;

public class DBTravelEntities extends Subject implements Visitable {

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

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}