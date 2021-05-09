package by.jwd.pravdivets.task6.karlssonairlines.abstractfactory;


import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;

public class PlaineFactory {
	
	public static Plane getPlain(PlaneAbstractFactory factory) {
		return factory.createPlane();
	}
	
}
