package reservation_system.commands;

import reservation_system.travel_entities.TravelEntity;
import reservation_system.users.ui.GUI;
import reservation_system.visitor.Visitor;

import java.util.HashMap;
// https://refactoring.guru/design-patterns/command/java/example and all descendants
public abstract class Command {
	private Object invoker;
	private Object receiver;

	public Command(Object i, Object r) {
		this.invoker = i;
		this.receiver = r;
	}

	public abstract void execute();

	public abstract void undo();

}