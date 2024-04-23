package reservation_system.commands.admin;

import reservation_system.commands.Command;
import reservation_system.users.ui.admin.AdminGUI;
import reservation_system.users.ui.admin.AdminGUIMain;

public class AdminMainCommand implements Command {
    private AdminGUI receiver;

    public AdminMainCommand(AdminGUI view) { this.receiver = view; }

    @Override
    public void execute() { this.receiver.stateManager(new AdminGUIMain(receiver)); }

    @Override
    public void undo() { } // Can't be undone
}
