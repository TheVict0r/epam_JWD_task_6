package by.jwd.pravdivets.task6.karlssonairlines.logic;

import java.util.ArrayList;
import java.util.List;

import by.jwd.pravdivets.task6.karlssonairlines.dao.DataProvider;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.exception.DaoException;

public class Airline {

	
	public List<Plane> makeAircraftFleet() throws DaoException{
	
		List<Plane> allPlanes = new ArrayList<>();
		
		DataProvider dataProvider = DataProvider.getInstance();
		String planesData = dataProvider.loadData();
		
		String[] byPlane = planesData.split("*");
		
		return allPlanes;
	}
	
}
