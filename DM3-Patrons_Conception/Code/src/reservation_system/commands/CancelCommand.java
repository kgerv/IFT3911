package reservation_system.commands;

import reservation_system.users.ui.GUI;
import reservation_system.commands.Command;

public class CancelCommand implements Command {
    private GUI receiver;

    @Override
    public void execute() {
        this.receiver.previousState();
    }

    @Override
    public void undo() {} // Can't be undone
}
