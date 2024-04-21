package reservation_system.commands;

public class CancelCommand extends Command {
    public CancelCommand(Object i, Object r) {
        super(i, r);
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() { /* Cannot undo cancel*/ }
}
