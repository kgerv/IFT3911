package reservation_system.commands;


// https://refactoring.guru/design-patterns/command/java/example and all descendants
public abstract class Command {

	public abstract void execute();

	public abstract void undo();

}