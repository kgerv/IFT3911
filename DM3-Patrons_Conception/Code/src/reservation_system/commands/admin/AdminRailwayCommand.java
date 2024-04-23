package reservation_system.commands.admin;

import reservation_system.commands.Command;
import reservation_system.users.ui.admin.AdminGUI;
import reservation_system.users.ui.admin.AdminGUIRailway;

public class AdminRailwayCommand implements Command {
    private AdminGUI receiver;

    public AdminRailwayCommand(AdminGUI view) {
        this.receiver = view;
    }

    @Override
    public void execute() {
        this.receiver.stateManager(new AdminGUIRailway());
    }

    @Override
    public void undo() {

    }
}
