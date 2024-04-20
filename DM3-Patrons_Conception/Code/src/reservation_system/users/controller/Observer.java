package reservation_system.users.controller;

import reservation_system.Subject;

public abstract class Observer {

	/**
	 * 
	 * @param s
	 */
	public abstract void update(Subject s);

}