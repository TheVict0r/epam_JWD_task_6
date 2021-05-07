package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Shipment extends CargoUnit implements Serializable{
	
	private int id; 
	private int weight;
	private int capacity;
	
	private double price ;
	
	public Shipment() {
		
	}
	
	public Shipment(int id, int weight, int capacity, double price) {
		super(id, weight, capacity);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public boolean equals(Object o) {
		
		if(!super.equals(o)) {
			return false;
		}  
		
		Shipment shipment = (Shipment) o;
			if (this.price != shipment.price) {
				return false;
			}
			return true;
	}
	
	@Override
	public int hashCode() {
		final int meaning = 42;
		int result = super.hashCode();
		result = result * meaning * meaning + meaning + (int)price;
		
		return result;
	}
	
	@Override
	public String toString() {
		return super.toString() + " [price - " + price + "]";
	}
	
	
}
