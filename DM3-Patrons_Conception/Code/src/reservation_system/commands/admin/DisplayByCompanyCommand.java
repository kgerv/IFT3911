package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

import java.util.List;

public class DisplayByCompanyCommand extends AdminCommand {

    public DisplayByCompanyCommand(List<String> args, Admin admin) {
        super(args, admin);
    }

    @Override
    public void execute() {
        this.admin.displayTravelByCompany(args.get(0));
    }

    @Override
    public void undo() {} //Can't be undone
}
