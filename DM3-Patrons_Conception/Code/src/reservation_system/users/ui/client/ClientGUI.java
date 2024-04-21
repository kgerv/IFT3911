package reservation_system.users.ui.client;

import reservation_system.Subject;
import reservation_system.users.controller.client.Client;
import reservation_system.users.controller.Observer;
import reservation_system.users.ui.GUI;

public class ClientGUI extends Observer implements GUI {

	private Client controller;

	public ClientGUI(Client controller) {
		this.controller = controller;
	}

	/**
	 * 
	 * @param e
	 */

	@Override
	public void display() {
		System.out.println("1. ");
	}

	public void displaySearch() {
		// TODO - implement ReservationSystem.User.UI.Client.ClientGUI.displaySearch
		throw new UnsupportedOperationException();
	}

	public void displayReservation() {
		// TODO - implement ReservationSystem.User.UI.Client.ClientGUI.displayReservation
		throw new UnsupportedOperationException();
	}

	public void displayPayment() {
		// TODO - implement ReservationSystem.User.UI.Client.ClientGUI.displayPayment
		throw new UnsupportedOperationException();
	}

	@Override
	public void update(Subject s) {

	}
}