package by.jwd.pravdivets.task6.karlssonairlines.entity.cargo;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Cargo implements Serializable{
	
	private int id; 
	private int weight;
	private double price;
		
	public Cargo() {
	}

	public Cargo(int id, double price) {
		this.id = id;
		this.price = price;
	}

	public Cargo(int id, double price, int weight) {
		this.id = id;
		this.price = price;
		this.weight = weight;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (this.getClass() != o.getClass()) {
			return false;
		}
		Cargo unit = (Cargo) o;
		if (this.id != unit.getId()) {
			return false;
		}
		if (this.weight != unit.getWeight()){
			return false;
		}
		if (Double.doubleToLongBits(this.price) != 
				Double.doubleToLongBits(unit.getPrice())) {
			return false;
		}
		else {
			return true;
		}
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime * prime + prime + weight;
		result = result * prime * prime + prime + id;
		result = result * prime * prime + prime + (int)price;
		return result;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ": [id - " + id + ", weight - " + weight + ", price - " + price; //специально не закрывал "]", чтобы продолжить строку в производных классах.
	}

}
