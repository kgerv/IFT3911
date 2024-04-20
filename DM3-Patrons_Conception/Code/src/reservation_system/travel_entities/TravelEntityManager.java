package reservation_system.travel_entities;

public interface TravelEntityManager {

	void add();

	/**
	 * 
	 * @param e
	 */
	void edit(TravelEntity e);

	/**
	 * 
	 * @param e
	 */
	void delete(TravelEntity e);

}