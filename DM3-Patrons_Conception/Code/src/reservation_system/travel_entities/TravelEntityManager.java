package reservation_system.travel_entities;

import java.util.List;
public interface TravelEntityManager {

	void add(TravelEntity e);

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

	List<TravelEntity> get();

}