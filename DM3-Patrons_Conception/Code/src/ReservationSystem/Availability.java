package ReservationSystem;

import ReservationSystem.TravelEntities.Place;

public interface Availability {

	/**
	 * 
	 * @param context
	 */
	void event(Place context);

}