package reservation_system.commands;

public class Invoker {
    private Command command;

    public Invoker() {}

    public void setCommand(Command command) { this.command = command; }

    public void execute() { this.command.execute(); }
}
