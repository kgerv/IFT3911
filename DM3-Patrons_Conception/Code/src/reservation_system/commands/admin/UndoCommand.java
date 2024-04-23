package reservation_system.commands.admin;

import reservation_system.commands.Command;
import reservation_system.users.ui.GUI;

import java.util.List;

public class UndoCommand implements Command {
    private GUI receiver;

    public UndoCommand(GUI receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.undo();
    }

    @Override
    public void undo() { } // Need to add redo for this
}
