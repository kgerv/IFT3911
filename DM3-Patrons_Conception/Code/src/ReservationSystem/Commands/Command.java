package ReservationSystem.Commands;

import ReservationSystem.TravelEntities.TravelEntity;
import ReservationSystem.Visitor.Visitor;

import java.util.HashMap;

public abstract class Command implements Visitor {

	protected HashMap<String, TravelEntity> backup;

	public void execute() {}

	/**
	 * 
	 * @param db
	 */
	public void saveBackup(HashMap<String, TravelEntity> db) {
		// TODO - implement ReservationSystem.Commands.Command.saveBackup
		throw new UnsupportedOperationException();
	}

	public void undo() {
		// TODO - implement ReservationSystem.Commands.Command.undo
		throw new UnsupportedOperationException();
	}

}