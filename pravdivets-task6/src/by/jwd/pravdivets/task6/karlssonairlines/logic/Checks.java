package by.jwd.pravdivets.task6.karlssonairlines.logic;

import java.util.List;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Cargo;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullCargoException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullPlaneException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullPlaneListException;

public class Checks {

	public static void plainCheck(Plane plane) throws NullPlaneException {
		if (plane == null) {
			throw new NullPlaneException("Undefined plane " + plane, new NullPointerException());
		}
	}
	
	public static void passengersCheck(Passenger[] passengers) throws NullCargoException {
		if (passengers == null) {
			throw new NullCargoException("Undefined cargo " + passengers, new NullPointerException());
		}
	}
	
	public static void cargoCheck(Cargo cargo) throws NullCargoException {
		if (cargo == null) {
			throw new NullCargoException("Undefined cargo " + cargo, new NullPointerException());
		}

	}
	
	public static void planeListCheck(List<Plane> planes) throws NullPlaneListException {
		if (planes == null) {
			throw new NullPlaneListException("The list of planes is empty " + planes, new NullPointerException());
		}
	}
}
