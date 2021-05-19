package by.jwd.pravdivets.task6.karlssonairlines.entity.cargo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Shipment extends AbstractCargo implements Serializable{

	public Shipment() {
		
	}
	
	public Shipment(int id, int price, int weight) {
		super(id, price, weight);
	}

	@Override
	public String toString() {
		return super.toString() + "]";
	}
	
}
