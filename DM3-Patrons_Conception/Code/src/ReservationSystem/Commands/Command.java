package ReservationSystem.Commands;

import ReservationSystem.TravelEntities.TravelEntity;
import ReservationSystem.Visitor.Visitor;

public abstract class Command implements Visitor {

	protected HashMap<String, TravelEntity> backup;

	public void execute() {
		// TODO - implement ReservationSystem.Commands.Command.execute
		throw new UnsupportedOperationException();
	}

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