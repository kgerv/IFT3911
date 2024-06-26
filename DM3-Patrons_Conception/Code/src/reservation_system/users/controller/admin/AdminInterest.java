package reservation_system.users.controller.admin;
import java.util.List;


public interface AdminInterest {

	/**
	 * 
	 * @param context
	 */
	void updateInterest(Admin context);

	void addCompany(List<String> args);

	void editCompany(List<String> args);

	void deleteCompany(List<String> args);

	void addTravel(List<String> args, List<String> facilitiesID);

	void editTravel(List<String> args);

	void deleteTravel(List<String> args);

	void addFacility(List<String> args);

	void editFacility(List<String> args);

	void deleteFacility(List<String> args);

	void assignPriceToSection(List<String> args);

	void displayTravelByOrigin(List<String> origin);

	void displayTravelByDestination(List<String> destination);

	void displayTravelByCompany(List<String> company);

}