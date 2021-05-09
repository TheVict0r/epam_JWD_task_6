package by.jwd.pravdivets.task6.karlssonairlines.main;


import java.io.FileNotFoundException;
import java.util.List;

import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.An124Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.Boeing737300Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.PlaineFactory;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.exception.CargoOverloadException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.DaoException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullCargoException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullPlaneException;
import by.jwd.pravdivets.task6.karlssonairlines.logic.AirlineCompany;
import by.jwd.pravdivets.task6.karlssonairlines.logic.CargoLoader;
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
		} catch (NullPlaneException | NullCargoException | CargoOverloadException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(an124);
		
		
		System.out.println("******************Делаем пассажирский самолёт**********");
		Plane boeing300 = PlaineFactory.getPlain(new Boeing737300Factory(6, 1999));
		System.out.println(boeing300);
		System.out.println("**************Загружаем в него пассажиров****************");
		try {
			loader.loadPassangers((Airliner)boeing300, (loader.makePassengersPool(45, 100, 150, 75)));
		} catch (NullPlaneException | NullCargoException | CargoOverloadException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(boeing300);
		

		System.out.println("************Делаем авиакомпанию - данные считываем из файла*************************");
		AirlineCompany airline = new AirlineCompany();
		
		try {
			List<Plane> planes = airline.makeAircraftFleet();
			for(Plane plane : planes) {
				System.out.println("******  " + plane);
			}
			
		} catch (DaoException | NullPlaneException | NullCargoException | CargoOverloadException e) {
			
			e.printStackTrace();
		}
	}

}
