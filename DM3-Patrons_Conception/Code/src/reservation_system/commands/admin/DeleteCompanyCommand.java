package reservation_system.commands.admin;

import reservation_system.users.controller.admin.Admin;

public class DeleteCompanyCommand extends AdminCommand {
    public DeleteCompanyCommand(Admin a) {
        super(a);
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
