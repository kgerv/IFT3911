package reservation_system.commands.admin;

import reservation_system.commands.Command;
import reservation_system.users.ui.admin.AdminGUI;
import reservation_system.users.ui.admin.AdminGUICruise;
import reservation_system.users.ui.admin.AdminGUIMain;

public class AdminCruiselineCommand implements Command {
    private AdminGUI receiver;

    public AdminCruiselineCommand(AdminGUI view) {
        this.receiver = view;
    }

    @Override
    public void execute() {
        this.receiver.stateManager(new AdminGUICruise());
    }

    /**
     * Back to main menu
     */
    @Override
    public void undo() {
        this.receiver.stateManager(new AdminGUIMain(receiver));
    }
}
