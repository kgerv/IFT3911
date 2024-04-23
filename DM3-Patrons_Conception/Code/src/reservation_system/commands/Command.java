package reservation_system.commands;

import reservation_system.Controller;

import java.util.List;

// https://refactoring.guru/design-patterns/command/java/example and all descendants
public interface Command {

	public abstract void execute();

	public abstract void undo();

}