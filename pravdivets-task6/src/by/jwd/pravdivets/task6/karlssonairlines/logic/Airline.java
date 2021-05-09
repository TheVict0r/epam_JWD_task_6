package by.jwd.pravdivets.task6.karlssonairlines.logic;

import java.util.ArrayList;
import java.util.List;

import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.Boeing737300Factory;
import by.jwd.pravdivets.task6.karlssonairlines.abstractfactory.PlaineFactory;
import by.jwd.pravdivets.task6.karlssonairlines.dao.DataProvider;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Airliner;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.exception.CargoOverloadException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.DaoException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullCargoException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullPlaneException;

public class Airline {

	
	public List<Plane> makeAircraftFleet() throws DaoException, NullPlaneException, NullCargoException, CargoOverloadException{
	
		List<Plane> allPlanes = new ArrayList<>();
		CargoLoader loader = new CargoLoader();
		DataProvider dataProvider = DataProvider.getInstance();
		
		String allPlanesData;
		allPlanesData = dataProvider.loadData();
		
		String[] byPlane;
		byPlane = allPlanesData.split("*");
		
		for(String unit : byPlane) {
			String [] onePlane;
			onePlane = unit.split("\\s+");
			
			if ("B300".equals(onePlane[0])) {
				int[] data = parceAirliner(onePlane); 
				Plane plane = PlaineFactory.getPlain(new Boeing737300Factory(data[0], data[1]));
				loader.loadPassangers((Airliner)plane, (loader.makePassengersPool(data[2], data[3], data[4], data[5])));
				allPlanes.add(plane);
			}
			
			
		}
		
		
		return allPlanes;
	}
	
	private int[] parceAirliner(String[] onePlane) {
		int[] result = new int[6];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = Integer.parseInt(onePlane[i+1]);
		}
		
		return result;
	}
	
	
}
