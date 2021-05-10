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
import by.jwd.pravdivets.task6.karlssonairlines.exception.InvalidPlaneDataException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullCargoException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullPlaneException;

public class AirlineCompany {

	CargoLoader loader = new CargoLoader();

	
	public List<Plane> makeAircraftFleet() throws DaoException, NullPlaneException, NullCargoException, CargoOverloadException, InvalidPlaneDataException{
	
		List<Plane> allPlanes = new ArrayList<>();
		
		String[] byPlane;
		byPlane = prepareDataByPlane();
		
		for(String unit : byPlane) {
			String [] onePlane;
			onePlane = unit.split("\\s+");

			int[] dataForPlane = parseForPlane(onePlane);
			
			if ("B300".equals(onePlane[0])) { //всё равно от if/switch пока не могу избавиться
				allPlanes.add(makeAirliner(dataForPlane, new Boeing737300Factory(dataForPlane[0], dataForPlane[1])));
			} else if ("B500".equals(onePlane[0])) { 
				allPlanes.add(makeAirliner(dataForPlane, new Boeing737500Factory(dataForPlane[0], dataForPlane[1])));
			} else if ("B800".equals(onePlane[0])) { 
				allPlanes.add(makeAirliner(dataForPlane, new Boeing737800Factory(dataForPlane[0], dataForPlane[1])));
			} else if ("An124".equals(onePlane[0])) { 
				allPlanes.add(makeCargoAircraft(dataForPlane, new An124Factory(dataForPlane[0], dataForPlane[1])));
			}
		}
		return allPlanes;
	}

	private String[] prepareDataByPlane() throws DaoException {
		DataProvider dataProvider = DataProvider.getInstance();
		
		String allPlanesData;
		allPlanesData = dataProvider.loadData();
		
		Pattern pattern = Pattern.compile("\\t");
		
		String[] byPlane;
		byPlane = pattern.split(allPlanesData);

		return byPlane;
	}

	
	private int[] parseForPlane(String[] onePlane) {
		int[] result = new int[6];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = Integer.parseInt(onePlane[i+1]);
		}
		return result;
	}

	
	private Plane makeAirliner(int[] dataForPlane, PlaneAbstractFactory factory) throws NullPlaneException, NullCargoException, CargoOverloadException {
		Plane plane = PlaineFactory.getPlain(factory);
		loader.loadPassangers((Airliner)plane, (loader.makePassengersPool(dataForPlane[2], dataForPlane[3], dataForPlane[4], dataForPlane[5])));
		return plane;
	}
	
	private Plane makeCargoAircraft(int[] dataForPlane, PlaneAbstractFactory factory) throws NullPlaneException, NullCargoException, CargoOverloadException  {
		Plane plane = PlaineFactory.getPlain(factory);
		loader.loadShipment(((CargoAircraft)plane), new Shipment(dataForPlane[2], dataForPlane[3], dataForPlane[4]));
		return plane;
	}
}
