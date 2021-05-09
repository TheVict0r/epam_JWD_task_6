package by.jwd.pravdivets.task6.karlssonairlines.entity;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;

// грузовой
public class CargoAircraft extends AbstractPlane{

	private Shipment shipment; //груз определяем цельным объектом
	
	public CargoAircraft() {
		
	}
	
	public CargoAircraft(int id, int manufactYear, int maxLoad, int flightRange, int maxSpeed,
			int fuelConsumption, Shipment shipment) {
		super(id, manufactYear, maxLoad, flightRange, maxSpeed, fuelConsumption);
		this.shipment = shipment;
	}
	
	
}
