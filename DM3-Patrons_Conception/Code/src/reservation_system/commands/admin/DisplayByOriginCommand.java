package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class DisplayByOriginCommand extends AdminCommand{
    public DisplayByOriginCommand(List<String> args, Admin admin) {
        super(args, admin);
    }

    @Override
    public void execute() {
        this.admin.displayTravelByOrigin(args.get(0));
    }

    @Override
    public void undo() {} // Can't be undone
}
