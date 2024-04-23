package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class EditTravelCommand extends AdminCommand {
    public EditTravelCommand(List<String> args, Admin admin) {
        super(args, admin);
    }

    @Override
    public void execute() {
        this.admin.editTravel(args);
    }

    @Override
    public void undo() {
        this.admin.editTravel(args);
    }
}
