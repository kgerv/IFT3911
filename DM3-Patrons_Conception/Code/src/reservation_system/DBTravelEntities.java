package reservation_system;

import reservation_system.travel_entities.TravelEntity;
import reservation_system.visitor.Visitable;
import reservation_system.visitor.Visitor;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DBTravelEntities extends Subject {
	private Map<String, TravelEntity> db;

	public DBTravelEntities() {
		db = new HashMap<>();
		try {
			File save = new File("path/db.txt");
			FileInputStream fis = new FileInputStream(save);
			ObjectInputStream ois = new ObjectInputStream(fis);
			db = (HashMap<String, TravelEntity>) ois.readObject();
			ois.close();
		} catch(IOException | ClassNotFoundException e) {
			System.out.println("Error while loading database content");
			e.printStackTrace();
		}
	}

	public Map<String, TravelEntity> getDB() {
		return db;
	}

	/**
	 * 
	 * @param map
	 */
	public void setDB(Map<String, TravelEntity> map) {
		db = map;
	}
}