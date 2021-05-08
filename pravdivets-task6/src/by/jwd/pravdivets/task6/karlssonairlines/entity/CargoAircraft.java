package by.jwd.pravdivets.task6.karlssonairlines.entity;
// грузовой
public class CargoAircraft extends AbstractPlane{

	public CargoAircraft() {
		
	}
	
	public CargoAircraft(int id, int manufactYear, int maxLoad, int flightRange, int maxSpeed,
			int fuelConsumption, Shipment[] shipment) {
		super(id, manufactYear, maxLoad, flightRange, maxSpeed, fuelConsumption, shipment);
		}
	
}
