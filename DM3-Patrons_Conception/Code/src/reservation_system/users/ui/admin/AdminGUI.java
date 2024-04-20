package reservation_system.users.ui.admin;

import reservation_system.Subject;
import reservation_system.users.controller.Observer;
import reservation_system.users.controller.admin.Admin;
import reservation_system.users.ui.GUI;

public class AdminGUI extends Observer implements GUI {

	private Admin controller;

<<<<<<< HEAD:DM3-Patrons_Conception/Code/src/ReservationSystem/Users/UI/Admin/AdminGUI.java
	public AdminGUI() {
=======
	public AdminGUI(Admin controller) {
		this.controller = controller;
>>>>>>> 7761c6a6ab2489b027e879ff46de94a5859404d6:DM3-Patrons_Conception/Code/src/reservation_system/users/ui/admin/AdminGUI.java
	}

	/**
	 * 
	 * @param e
	 */
	public void listen(Event e) {
		// TODO - implement ReservationSystem.User.UI.Admin.AdminGUI.listen
		throw new UnsupportedOperationException();
	}

	@Override
	public void display() {

	}

	public void displayManager() {
		// TODO - implement ReservationSystem.User.UI.Admin.AdminGUI.displayManager
		throw new UnsupportedOperationException();
	}

	// change state of view between types

	private buttonAirEntities(){}
	private buttonCruiseEntities(){}
	private buttonTrainEntities(){}

	@Override
	public void update(Subject s) {

	}
}