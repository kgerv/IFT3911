package reservation_system.commands.admin;

import reservation_system.commands.Command;
import reservation_system.users.controller.admin.Admin;

public abstract class AdminCommand extends Command {
    protected Admin receiver;
    
    public AdminCommand(Admin a) {
        this.receiver = a;
    }
}
