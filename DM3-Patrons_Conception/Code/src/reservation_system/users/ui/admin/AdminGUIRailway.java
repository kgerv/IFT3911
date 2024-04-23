package reservation_system.users.ui.admin;

import reservation_system.commands.Invoker;
import reservation_system.commands.admin.AdminMainCommand;

public class AdminGUIRailway implements AdminGUIState {
    private AdminGUI view;

    public AdminGUIRailway(AdminGUI g) { this.view = g; }

    @Override
    public void display() { } // Only keywords are changed

    /**
     * Back to main menu
     */
    @Override
    public void cancel() {
        Invoker button = new Invoker();
        button.setCommand(new AdminMainCommand(this.view));
        button.execute();
    }

    @Override
    public void updateKeywords(AdminGUI g) {
        g.keywords = new String[]{"Railway", "Train station", "Train", "Train route"};
    }
}
