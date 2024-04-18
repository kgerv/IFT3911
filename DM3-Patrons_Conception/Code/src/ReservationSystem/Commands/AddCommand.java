package ReservationSystem.Commands;

import ReservationSystem.ReservationSystem;
import ReservationSystem.Users.UI.GUI;

public abstract class AddCommand extends Command {
    public AddCommand(GUI gui) {
        super(gui);
    }

    @Override
    public void execute() {

    }
}