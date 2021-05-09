package by.jwd.pravdivets.task6.karlssonairlines.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.An124Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.Boeing737300Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.Boeing737500Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.Boeing737800Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.PlaineFactory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.PlaneAbstractFactory;
import by.jwd.pravdivets.task6.karlssonairlines.dao.DataProvider;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Airliner;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.CargoAircraft;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.exception.CargoOverloadException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.DaoException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullCargoException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullPlaneException;

public class Airline {

	CargoLoader loader = new CargoLoader();

	
	public List<Plane> makeAircraftFleet() throws DaoException, NullPlaneException, NullCargoException, CargoOverloadException{
	
		List<Plane> allPlanes = new ArrayList<>();
		
		DataProvider dataProvider = DataProvider.getInstance();
		
		String allPlanesData;
		allPlanesData = dataProvider.loadData();
		
				
		Pattern pattern = Pattern.compile("  ");
		
		String[] byPlane;
		byPlane = pattern.split(allPlanesData);
		
		for(String unit : byPlane) {
			String [] onePlane;
			onePlane = unit.split("\\s+");
			
			//int[] data = parseAirliner(onePlane); 
			
			if ("B300".equals(onePlane[0])) { //всё равно от if/switch пока не могу избавиться
				int[] data = parseAirliner(onePlane);
				allPlanes.add(makeAirliner(onePlane, new Boeing737300Factory(data[0], data[1])));
			} else if ("B500".equals(onePlane[0])) { 
				int[] data = parseAirliner(onePlane);
				allPlanes.add(makeAirliner(onePlane, new Boeing737500Factory(data[0], data[1])));
			} else if ("B800".equals(onePlane[0])) { 
				int[] data = parseAirliner(onePlane);
				allPlanes.add(makeAirliner(onePlane, new Boeing737800Factory(data[0], data[1])));
			} else if ("An124".equals(onePlane[0])) { 
				int[] data = parseCargoAircraft(onePlane);
				allPlanes.add(makeCargoAircraft(onePlane, new An124Factory(data[0], data[1])));
			}
		}
		
		return allPlanes;
	}

	
	private int[] parseAirliner(String[] onePlane) {
		int[] result = new int[6];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = Integer.parseInt(onePlane[i+1]);
		}
		return result;
	}

	
	private int[] parseCargoAircraft(String[] onePlane) {
		int[] result = new int[5];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = Integer.parseInt(onePlane[i+1]);
		}
		return result;
	}
	
	private Plane makeAirliner(String [] onePlane, PlaneAbstractFactory factory) throws NullPlaneException, NullCargoException, CargoOverloadException {
		int[] data = parseAirliner(onePlane); 
		Plane plane = PlaineFactory.getPlain(factory);
		loader.loadPassangers((Airliner)plane, (loader.makePassengersPool(data[2], data[3], data[4], data[5])));
		return plane;
	}
	
	private Plane makeCargoAircraft(String [] onePlane, PlaneAbstractFactory factory) throws NullPlaneException, NullCargoException, CargoOverloadException  {
		int[] data = parseCargoAircraft(onePlane); 
		Plane plane = PlaineFactory.getPlain(factory);
		loader.loadShipment(((CargoAircraft)plane), new Shipment(data[2], data[3], data[4]));
		return plane;
	}
}
