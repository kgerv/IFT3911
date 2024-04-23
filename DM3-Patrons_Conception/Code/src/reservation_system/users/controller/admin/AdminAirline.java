package reservation_system.users.controller.admin;

import reservation_system.travel_entities.AirTravelFactory;
import reservation_system.travel_entities.Facility;
import reservation_system.travel_entities.Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class AdminAirline implements AdminInterest {

    public AdminAirline() {}

    @Override
    public void updateInterest(Admin context) {

    }

    @Override
    public void display() {

    }

    @Override
    public void addCompany(List<String> args) {

    }

    @Override
    public void editCompany(List<String> args) {

    }

    @Override
    public void deleteCompany(List<String> args) {

    }

    @Override
    public void addTravel(List<String> args, List<String> facilitiesID) {
        String id = args.get(0);
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        Calendar dep = Calendar.getInstance();
        Calendar arv = (Calendar) dep.clone();
        try {
            dep.setTime(sdf.parse(args.get(1)));
            arv.setTime(sdf.parse(args.get(2)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        float fullPrice = Float.parseFloat(args.get(3));
        List<Facility> facilities = new ArrayList<>();
        for(String s : facilitiesID) {

        }
        Vehicle vehicle = null ;
    }

    @Override
    public void editTravel(List<String> args) {
        
    }

    @Override
    public void deleteTravel(List<String> args) {

    }

    @Override
    public void addFacility(List<String> args) {

    }

    @Override
    public void editFacility(List<String> args) {

    }

    @Override
    public void deleteFacility(List<String> args) {

    }

    @Override
    public void assignPriceToSection(List<String> args) {

    }

    @Override
    public void displayTravelByOrigin(String origin) {

    }

    @Override
    public void displayTravelByDestination(String destination) {

    }

    @Override
    public void displayTravelByCompany(String company) {

    }
}
