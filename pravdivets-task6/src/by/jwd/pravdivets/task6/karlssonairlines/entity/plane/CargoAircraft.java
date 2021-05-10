package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;

import java.io.Serializable;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Shipment;

// грузовой
@SuppressWarnings("serial")
public abstract class CargoAircraft extends Plane implements Serializable{

	private Shipment shipment; //груз определяем единым объектом
	
	public CargoAircraft() {
		
	}
	
	public CargoAircraft(int id, int manufactYear, int maxLoad, int flightRange, int cruiseSpeed,
			int fuelConsumption) {
		super(id, manufactYear, maxLoad, flightRange, cruiseSpeed, fuelConsumption);
		
	}

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((shipment == null) ? 0 : shipment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		if (!super.equals(obj))
			return false;
		CargoAircraft other = (CargoAircraft) obj;
		if (shipment == null) {
			if (other.shipment != null)
				return false;
		} else if (!shipment.equals(other.shipment))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		double currentLoad = 0;
		if(shipment != null) {
			currentLoad = shipment.getWeight(); 
		}
		
		return super.toString() + ", maximum load - " +  super.getMaxLoad() + " kg, current load - " + currentLoad + " kg]";
	}
}
