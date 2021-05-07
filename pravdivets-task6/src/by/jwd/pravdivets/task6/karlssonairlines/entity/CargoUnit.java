package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class CargoUnit implements Serializable{
	
	private double weight;
	private double capacity;
		
	public CargoUnit() { }
	
	public CargoUnit (double weight, double capacity) {
		this.weight = weight;
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
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
		CargoUnit unit = (CargoUnit) o;
		if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(unit.getWeight())){
			return false;
		}
		if (Double.doubleToLongBits(this.capacity) != Double.doubleToLongBits(unit.getCapacity())){
			return false;
		} else {
			return true;
		}
	}	
	
	@Override
	public int hashCode() {
		final int meaning = 42;
		int result = 1;
		
		double
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[weight - " + weight + ", capacity - " + capacity + "]";
	}
	
}
