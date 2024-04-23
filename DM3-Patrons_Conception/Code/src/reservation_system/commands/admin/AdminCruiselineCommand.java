package reservation_system.commands.admin;

import reservation_system.commands.Command;
import reservation_system.users.ui.admin.AdminGUI;
import reservation_system.users.ui.admin.AdminGUICruise;

public class AdminCruiselineCommand implements Command {
    private AdminGUI receiver;

    public AdminCruiselineCommand(AdminGUI view) {
        this.receiver = view;
    }

    @Override
    public void execute() {
        this.receiver.stateManager(new AdminGUICruise());
    }

    @Override
    public void undo() {

    }
}
