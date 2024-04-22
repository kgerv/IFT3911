package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class DeleteTravelCommand extends AdminCommand {

    public DeleteTravelCommand(List<String> args, Admin admin) {
        super(args, admin);
    }

    @Override
    public void execute() {
        this.admin.deleteTravel(args);
    }

    @Override
    public void undo() {
        this.admin.addTravel(args);
    }
}
