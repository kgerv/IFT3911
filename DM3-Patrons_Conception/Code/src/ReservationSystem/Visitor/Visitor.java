package ReservationSystem.Visitor;

import ReservationSystem.TravelEntities.Company;
import ReservationSystem.DBTravelEntities;
import ReservationSystem.TravelEntities.Facility;
import ReservationSystem.TravelEntities.Section;
import ReservationSystem.TravelEntities.Travel;
import ReservationSystem.TravelEntities.Vehicle;

public interface Visitor {

	/**
	 * 
	 * @param db
	 */
	void visit(DBTravelEntities db);

	/**
	 * 
	 * @param t
	 */
	void visit(Travel t);

	/**
	 * 
	 * @param f
	 */
	void visit(Facility f);

	/**
	 * 
	 * @param c
	 */
	void visit(Company c);

	/**
	 * 
	 * @param v
	 */
	void visit(Vehicle v);

	/**
	 * 
	 * @param s
	 */
	void visit(Section s);

}