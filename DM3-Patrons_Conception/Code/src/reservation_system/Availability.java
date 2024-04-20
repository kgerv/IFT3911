package reservation_system;

import reservation_system.travel_entities.Place;

public interface Availability {

	/**
	 * 
	 * @param context
	 */
	public void updateState(Place context);
	public void previousState(Place context);
	public void nextState(Place context);

}