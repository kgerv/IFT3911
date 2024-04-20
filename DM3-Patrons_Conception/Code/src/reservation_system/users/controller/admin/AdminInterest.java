package reservation_system.users.controller.admin;

import reservation_system.travel_entities.Facility;
import reservation_system.travel_entities.Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public interface AdminInterest {

	/**
	 * 
	 * @param context
	 */
	void updateInterest(Admin context);

	void display();

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

	void displayTravelByOrigin(String origin);

	void displayTravelByDestination(String destination);

	void displayTravelByCompany(String company);

}