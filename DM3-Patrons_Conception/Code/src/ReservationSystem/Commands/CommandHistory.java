package ReservationSystem.Commands;

import java.util.Stack;
//https://refactoring.guru/design-patterns/command/java/example
public class CommandHistory {
	private Stack<Command> commands = new Stack<>();

	/**
	 * 
	 * @param c
	 */
	public void push(Command c) {
		commands.push(c);
	}

	public void pop() {
		commands.pop();
	}

	public boolean isEmpty() { return commands.isEmpty(); }
}