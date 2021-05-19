package by.jwd.pravdivets.task6.karlssonairlines.main;

import java.util.List;

import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.An124Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.Boeing737300Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.PlaineFactory;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.exception.InvalidPlaneDataException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NoSourceException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullCargoException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullPlaneException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullPlaneListException;
import by.jwd.pravdivets.task6.karlssonairlines.logic.AircraftServices;
import by.jwd.pravdivets.task6.karlssonairlines.logic.AirlineCompany;
import by.jwd.pravdivets.task6.karlssonairlines.logic.CargoLoader;
import by.jwd.pravdivets.task6.karlssonairlines.logic.comparator.IdComparator;
import by.jwd.pravdivets.task6.karlssonairlines.logic.comparator.YearComparator;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Airliner;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.CargoAircraft;

public class Main {
	public static void main(String[] args) {
		CargoLoader loader = new CargoLoader();
		
		System.out.println("**************Делаем грузовой самолёт*************");
		
		Plane an124 = PlaineFactory.getPlain(new An124Factory(1, 1990));
		System.out.println(an124);
		System.out.println("**************Загружаем в него груз****************");
		try {
			loader.loadShipment(((CargoAircraft)an124), new Shipment(15, 20000, 110000));
		} catch (NullPlaneException | NullCargoException  e1) {
			e1.printStackTrace();
		}
		
		System.out.println(an124);
		
		
		System.out.println("******************Делаем пассажирский самолёт**********");
		Plane boeing300 = PlaineFactory.getPlain(new Boeing737300Factory(6, 1999));
		System.out.println(boeing300);
		System.out.println("**************Загружаем в него пассажиров****************");
		try {
			loader.loadPassangers((Airliner)boeing300, (loader.makePassengersPool(45, 100, 150, 75)));
		} catch (NullPlaneException | NullCargoException  e) {
			
			e.printStackTrace();
		}
		
		System.out.println(boeing300);
		

		System.out.println("************Делаем авиакомпанию - данные считываем из файла*************************");
		AirlineCompany airline = new AirlineCompany();
		
		String source = "./src/resource/planes.txt";
		
		try {
			List<Plane> planes = airline.makeAircraftFleet(source);
			for(Plane plane : planes) {
				System.out.println("******  " + plane);
			}
			System.out.println("Full passengers capacity is " + AircraftServices.calculateTotalPassengersCapacity(planes));	
			System.out.println("Total payload is " + AircraftServices.calculateTotalPayloadLoad(planes));
			System.out.println("Planes found by FuelConsumption 2300 - 2590:");
			System.out.println(AircraftServices.findByFuelConsumption(planes, 2300, 2590));
			
			
			System.out.println("**********sorted by year************");
			
			AircraftServices.sortByOne(planes, new YearComparator());
			
			for(Plane plane : planes) {
				System.out.println("******  " + plane);
			}

			AircraftServices.sortByTwo(planes, new YearComparator(), new IdComparator());
			System.out.println("**********sorted by year and ID ************");
			for(Plane plane : planes) {
				System.out.println("******  " + plane);
			}

			
		} catch ( NullPlaneException | NullCargoException | NullPlaneListException | InvalidPlaneDataException | NoSourceException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
