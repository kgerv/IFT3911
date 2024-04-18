package ReservationSystem.Commands;

import ReservationSystem.TravelEntities.TravelEntity;
import ReservationSystem.Users.UI.GUI;
import ReservationSystem.Visitor.Visitor;

import java.util.HashMap;
// https://refactoring.guru/design-patterns/command/java/example and all descendants
public abstract class Command implements Visitor {
	public GUI gui;
	private HashMap<String, TravelEntity> backup;

	public Command(GUI gui) {
		this.gui = gui;
	}

	public abstract void execute();

	/**
	 * 
	 * @param db
	 */
	public void saveBackup(HashMap<String, TravelEntity> db) {
		this.backup = null; // TODO
	}

	public void undo() {
		// TODO
	}

}