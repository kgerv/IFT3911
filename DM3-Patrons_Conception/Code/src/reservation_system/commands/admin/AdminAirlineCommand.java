package reservation_system.commands.admin;

import reservation_system.commands.Command;
import reservation_system.users.ui.admin.AdminGUI;
import reservation_system.users.ui.admin.AdminGUIAirline;

public class AdminAirlineCommand implements Command {
    private AdminGUI receiver;

    public AdminAirlineCommand(AdminGUI view) {
        this.receiver = view;
    }

    @Override
    public void execute() {
        this.receiver.displayManager(new AdminGUIAirline());
    }

    @Override
    public void undo() {

    }
}
