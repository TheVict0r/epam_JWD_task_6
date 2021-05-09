package by.jwd.pravdivets.task6.karlssonairlines.logic;

import java.util.List;

import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Airliner;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;

public class AircraftServices {

	public static int calculatePassengersCapacity(List<Plane> planes) {
		int capacity = 0;
		
		for(Plane plane : planes) {
			if (plane instanceof Airliner) {
				capacity += ((Airliner) plane).getPassengers().length;
			}
		}
		return capacity;
	}
	
	
	
}
