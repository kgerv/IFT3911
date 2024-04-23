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

	@Override
	public void display() {
		System.out.println("1. ");
	}

	@Override
	public void cancel() {

	}

	@Override
	public void undo() {

	}

	@Override
	public void update(Subject s) {
	}
}