package by.jwd.pravdivets.task6.karlssonairlines.main;

import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.An124Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.Boeing737300Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.PlaineFactory;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.exception.CargoOverloadException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullCargoException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullPlaneException;
import by.jwd.pravdivets.task6.karlssonairlines.logic.CargoLoader;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Airliner;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.An124;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Boeing737300;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.CargoAircraft;

public class Main {
	public static void main(String[] args) {

		

		
		
		Plane an124 = new An124(1, 1990);
		System.out.println(an124);
		
		Shipment shipment = new Shipment(15, 20000.256, 1000);
		((CargoAircraft)an124).setShipment(shipment);
		System.out.println(an124);
		
		
		Plane boeing300 = PlaineFactory.getPlain(new Boeing737300Factory(6, 1999));
		System.out.println(boeing300);

		
		CargoLoader passengers = new CargoLoader();
		try {
			passengers.loadPassangers((Airliner)boeing300, (passengers.makePassengersPool(45, 100, 150, 75)));
		} catch (NullPlaneException | NullCargoException | CargoOverloadException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(((Airliner)boeing300).getPassengers()[3].toString());
		
	}

}
