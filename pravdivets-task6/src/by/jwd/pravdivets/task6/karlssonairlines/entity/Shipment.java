package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Shipment extends Cargo implements Serializable{

	public Shipment() {
		
	}
	
	public Shipment(int id, double price, int weight) {
		super(id, price, weight);
	}

	@Override
	public String toString() {
		return super.toString() + "]";
	}
	
	
}
