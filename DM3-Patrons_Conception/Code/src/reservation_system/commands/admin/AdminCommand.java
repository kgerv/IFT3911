package reservation_system.commands.admin;

import reservation_system.commands.Command;
import reservation_system.users.controller.admin.Admin;

import java.util.List;

public abstract class AdminCommand implements Command {
    protected Admin admin;
    protected List<String> args;

    public AdminCommand(List<String> args, Admin admin) {
        this.args = args;
        this.admin = admin;
    }
}
