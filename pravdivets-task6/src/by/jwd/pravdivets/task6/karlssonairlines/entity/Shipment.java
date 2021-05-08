package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Shipment extends Cargo implements Serializable{

	private double price ;
	
	public Shipment() {
		
	}
	
	public Shipment(int id, int weight, double price) {
		super(id, weight);
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
			if (Double.doubleToLongBits(this.price) != 
				Double.doubleToLongBits(shipment.price)) {
				return false;
			}
			return true;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = result * prime * prime + prime + (int)price;
		
		return result;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", price - " + price + "]";
	}
	
	
}
