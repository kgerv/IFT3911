package ReservationSystem.Commands;

import ReservationSystem.TravelEntities.Company;
import ReservationSystem.DBTravelEntities;
import ReservationSystem.TravelEntities.Facility;
import ReservationSystem.TravelEntities.Section;
import ReservationSystem.TravelEntities.Travel;
import ReservationSystem.TravelEntities.Vehicle;
import ReservationSystem.Users.UI.GUI;

public class AddCompany extends AddCommand {

    public AddCompany(GUI gui) {
        super(gui);
    }

    @Override
    public void visit(DBTravelEntities db) {

    }

    @Override
    public void visit(Travel t) {

    }

    @Override
    public void visit(Facility f) {

    }

    @Override
    public void visit(Company c) {

    }

    @Override
    public void visit(Vehicle v) {

    }

    @Override
    public void visit(Section s) {

    }
}