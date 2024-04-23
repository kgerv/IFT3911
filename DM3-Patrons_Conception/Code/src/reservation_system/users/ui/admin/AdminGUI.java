package reservation_system.users.ui.admin;

import reservation_system.Subject;
import reservation_system.users.controller.Observer;
import reservation_system.users.controller.admin.Admin;
import reservation_system.users.ui.GUI;

import java.util.Scanner;

public class AdminGUI extends Observer implements GUI {
	private AdminGUIState state;
	private Admin controller;
	protected String[] keywords;

	public AdminGUI(Admin controller, AdminGUIState state) {
		this.state = state;
		this.controller = controller;
	}

	@Override
	public void display() {}

	@Override
	public void cancel() {}

	@Override
	public void undo() { } // Nothing to undo

	public void stateManager(AdminGUIState s) {
		this.state = s;
	}

	@Override
	public void update(Subject s) {

	}
}