package reservation_system.users.ui.admin;

import reservation_system.commands.Command;

public class AdminRailwayCommand implements Command {
    private AdminGUI receiver;

    public AdminRailwayCommand(AdminGUI view) {
        this.receiver = view;
    }

    @Override
    public void execute() {
        this.receiver.stateManager(new AdminGUIRailway());
    }

    /**
     * Back to main menu
     */
    @Override
    public void undo() {
        this.receiver.stateManager(new AdminGUIMain(receiver));
    }
}
