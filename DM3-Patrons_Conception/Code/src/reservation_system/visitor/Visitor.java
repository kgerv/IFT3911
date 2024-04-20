package reservation_system.visitor;

import reservation_system.travel_entities.Company;
import reservation_system.DBTravelEntities;
import reservation_system.travel_entities.Facility;
import reservation_system.travel_entities.Section;
import reservation_system.travel_entities.Travel;
import reservation_system.travel_entities.Vehicle;

public interface Visitor {

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