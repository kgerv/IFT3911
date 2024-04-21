package reservation_system.commands.admin;

import reservation_system.commands.Command;

public abstract class AdminCommand extends Command {
    public AdminCommand(Object i, Object r) {
        super(i, r);
    }
}
