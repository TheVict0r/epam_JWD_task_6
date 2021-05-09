package by.jwd.pravdivets.task6.karlssonairlines.abstractfactory;

import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;

public class PlaneFactory {
	
	public static Plane getPlane(PlaneAbstractFactory factory) {
		return factory.createPlane();
	}
}