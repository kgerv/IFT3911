package ReservationSystem.Users.Observers;

import ReservationSystem.Subject;

public abstract class Observer {

	/**
	 * 
	 * @param s
	 */
	public abstract void update(Subject s);

}