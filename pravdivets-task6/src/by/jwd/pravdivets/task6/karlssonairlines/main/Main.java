package by.jwd.pravdivets.task6.karlssonairlines.main;

import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.An124Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.Boeing737300Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.PlaneFactory;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Airliner;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.An124;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Boeing737300;

public class Main {
	public static void main(String[] args) {

		Shipment shipment = new Shipment(15, 20000.256, 1000);

		System.out.println(shipment.hashCode());
		System.out.println(shipment);
		
		
		Passenger passenger1 = new Passenger(1, 120, true);
		System.out.println(passenger1.hashCode());
		System.out.println(passenger1);

		Passenger passenger2 = new Passenger(2, 70, false);
		System.out.println(passenger2.hashCode());
		System.out.println(passenger2);
		
		Airliner boeing300 = new Boeing737300(5, 1988);
		System.out.println(boeing300);
		
		Plane an124 = new An124(1, 1990);
		System.out.println(an124);
		
		
		Plane boeing300a = PlaneFactory.getPlane(new Boeing737300Factory(6, 1999));
		System.out.println(boeing300a);
		
		Plane an124a = PlaneFactory.getPlane(new An124Factory(2, 1991));
		System.out.println(an124a);
		
	}

}
