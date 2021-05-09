package by.jwd.pravdivets.task6.karlssonairlines.logic;

import java.util.ArrayList;
import java.util.List;

import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Airliner;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullPlaneListException;

public class AircraftServices {

	public static int calculateTotalPassengersCapacity(List<Plane> planes) throws NullPlaneListException {
		Checks.planeListCheck(planes);
		int capacity = 0;
		
		for(Plane plane : planes) {
			if (plane instanceof Airliner) {
				capacity += ((Airliner) plane).getPassengers().length;
			}
		}
		return capacity;
	}
	
	public static int calculateTotalPayloadLoad(List<Plane> planes) throws NullPlaneListException {
		Checks.planeListCheck(planes);
		
		int payloadLoad = 0;
		
		for(Plane plane : planes) {
				payloadLoad += plane.getMaxLoad();
		}
		return payloadLoad;
	}
	
	public static List<Plane> findByFuelConsumption(List<Plane> planes, int min, int max) throws NullPlaneListException{
		Checks.planeListCheck(planes);
		List<Plane> result = new ArrayList<>();
		for(Plane plane : planes) {
			if(plane.getFuelConsumption() >= min && plane.getFuelConsumption() <= max) {
				result.add(plane);
			}
	}
		return result;
	}
	
	
}
