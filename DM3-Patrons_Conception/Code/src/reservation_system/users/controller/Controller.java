package reservation_system.users.controller;

import reservation_system.users.ui.GUI;
import reservation_system.visitor.Visitor;

public abstract class Controller {

	private GUI view;

	public Controller(GUI g) {
		this.view = g;
	}


}