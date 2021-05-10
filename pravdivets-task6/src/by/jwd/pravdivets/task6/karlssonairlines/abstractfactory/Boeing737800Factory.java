package by.jwd.pravdivets.task6.karlssonairlines.abstractfactory;

import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Plane;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Boeing737800;

public class Boeing737800Factory implements PlaneAbstractFactory {

	int id; 
	int manufactYear;
	
	public Boeing737800Factory(int id, int manufactYear) {
		this.id = id;
		this.manufactYear = manufactYear;
	}
	
	@Override
	public Plane createPlane() {
		return new Boeing737800(id, manufactYear);
	}

}
