package ReservationSystem.TravelEntities;

import ReservationSystem.Availability;
import ReservationSystem.Available;

public abstract class Place {

	protected Availability state;
	protected String idPlace;

	public Place(String id) {
		this.idPlace = id;
		this.state = new Available(this);
	}

	/**
	 * 
	 * @param s
	 */
	public void setAvailability(Availability s) {
		this.state = s;
	}

}