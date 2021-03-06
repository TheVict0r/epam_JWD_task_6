package by.jwd.pravdivets.task6.karlssonairlines.abstractfactory;

import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.An124;

public class An124Factory implements PlaneAbstractFactory{

	int id; 
	int manufactYear; 
		
	public An124Factory(int id, int manufactYear) {
		this.id = id;
		this.manufactYear = manufactYear;
		
	}
	
	
	@Override
	public Plane createPlane() {
		
		return new An124(id, manufactYear);
	}
	
	
}
