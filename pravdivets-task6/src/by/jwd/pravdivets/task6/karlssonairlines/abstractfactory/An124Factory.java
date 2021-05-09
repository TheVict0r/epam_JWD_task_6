package by.jwd.pravdivets.task6.karlssonairlines.abstractfactory;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.AbstractPlane;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.An124;

public class An124Factory implements PlaneAbstractFactory{

	int id; 
	int manufactYear; 
	Shipment shipment;
	
	public An124Factory(int id, int manufactYear, Shipment shipment) {
		this.id = id;
		this.manufactYear = manufactYear;
		this.shipment = shipment;
	}
	
	
	@Override
	public AbstractPlane createPlane() {
		
		return new An124(id, manufactYear, shipment);
	}
	
	
}
