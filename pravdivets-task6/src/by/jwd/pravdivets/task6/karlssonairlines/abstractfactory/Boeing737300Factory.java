package by.jwd.pravdivets.task6.karlssonairlines.abstractfactory;

import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.AbstractPlane;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Boeing737300;

public class Boeing737300Factory implements PlaneAbstractFactory {

	int id; 
	int manufactYear;
	
	public Boeing737300Factory(int id, int manufactYear) {
		this.id = id;
		this.manufactYear = manufactYear;
	}
	
	@Override
	public AbstractPlane createPlane() {
		
		return new Boeing737300(id, manufactYear);
	}

}
