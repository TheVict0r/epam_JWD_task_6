package by.jwd.pravdivets.task6.karlssonairlines.main;


import java.io.FileNotFoundException;

import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.An124Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.Boeing737300Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.PlaineFactory;
import by.jwd.pravdivets.task6.karlssonairlines.dao.Reader;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.exception.CargoOverloadException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullCargoException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullPlaneException;
import by.jwd.pravdivets.task6.karlssonairlines.logic.CargoLoader;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Airliner;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.CargoAircraft;

public class Main {
	public static void main(String[] args) {
		CargoLoader loader = new CargoLoader();
		
		Plane an124 = PlaineFactory.getPlain(new An124Factory(1, 1990));
		System.out.println(an124);
		
		try {
			loader.loadShipment(((CargoAircraft)an124), new Shipment(15, 20000.256, 110000));
		} catch (NullPlaneException | NullCargoException | CargoOverloadException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(an124);
		
		Plane boeing300 = PlaineFactory.getPlain(new Boeing737300Factory(6, 1999));
		System.out.println(boeing300);

		try {
			loader.loadPassangers((Airliner)boeing300, (loader.makePassengersPool(45, 100, 150, 75)));
		} catch (NullPlaneException | NullCargoException | CargoOverloadException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(boeing300);
		
		System.out.println(((Airliner)boeing300).getPassengers()[3].toString());
		
		try {
			System.out.println(Reader.readFile());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
