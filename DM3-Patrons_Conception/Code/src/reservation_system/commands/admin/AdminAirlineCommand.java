package reservation_system.commands.admin;

import reservation_system.commands.Command;
import reservation_system.users.ui.admin.AdminGUI;
import reservation_system.users.ui.admin.AdminGUIAirline;
import reservation_system.users.ui.admin.AdminGUIMain;

public class AdminAirlineCommand implements Command {
    private AdminGUI receiver;

    public AdminAirlineCommand(AdminGUI view) {
        this.receiver = view;
    }

    @Override
    public void execute() {
        this.receiver.stateManager(new AdminGUIAirline(receiver));
    }

    /**
     * Back to main menu
     */
    @Override
    public void undo() {
        this.receiver.stateManager(new AdminGUIMain(receiver));
    }
}
