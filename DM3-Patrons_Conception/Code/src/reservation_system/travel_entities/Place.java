package reservation_system.travel_entities;

import reservation_system.Availability;
import reservation_system.Available;

public abstract class Place {

	protected Availability state;
	protected String idPlace;

	public Place(String id) {
		this.idPlace = id;
		this.state = new Available();
	}

	/**
	 * 
	 * @param s
	 */
	public void setAvailability(Availability s) {
		this.state = s;
	}

}