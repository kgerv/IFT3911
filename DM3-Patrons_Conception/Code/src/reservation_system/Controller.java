package reservation_system;

import reservation_system.users.ui.GUI;
import reservation_system.visitor.Visitor;

public abstract class Controller {

	private GUI view;
	private Visitor visitor;

	public Controller(GUI g, Visitor v) {
		this.view = g;
		this.visitor = v;
	}

}