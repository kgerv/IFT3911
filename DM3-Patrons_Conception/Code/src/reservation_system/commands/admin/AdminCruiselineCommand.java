package reservation_system.commands.admin;

import reservation_system.commands.Command;
import reservation_system.users.ui.admin.AdminGUI;

public class AdminCruiselineCommand implements Command {
    private AdminGUI view;

    public AdminCruiselineCommand(AdminGUI v) {
        this.view = v;
    }

    @Override
    public void execute() {
        this.view.displayManager(new );
    }

    @Override
    public void undo() {

    }
}
