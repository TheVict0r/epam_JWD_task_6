package by.jwd.pravdivets.task6.karlssonairlines.abstractfactory;

import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Boeing737500;

public class Boeing737500Factory implements PlaneAbstractFactory {

	int id; 
	int manufactYear;
	
	public Boeing737500Factory(int id, int manufactYear) {
		this.id = id;
		this.manufactYear = manufactYear;
	}
	
	@Override
	public Plane createPlane() {
		
		return new Boeing737500(id, manufactYear);
	}

}
