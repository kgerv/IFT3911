package ReservationSystem;

import ReservationSystem.TravelEntities.Place;

public interface Availability {

	/**
	 * 
	 * @param context
	 */
	public void setAvailability(Place context);
	public void previousState(Place context);
	public void nextState(Place context);

}