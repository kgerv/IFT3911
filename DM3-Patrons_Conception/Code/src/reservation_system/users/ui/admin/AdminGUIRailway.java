package reservation_system.users.ui.admin;

public class AdminGUIRailway implements AdminGUIState {
    @Override
    public void display() {

    }

    @Override
    public void cancel() {

    }

    @Override
    public void updateKeywords(AdminGUI g) {
        g.keywords = new String[]{"Railway", "Train station", "Train"};
    }
}
