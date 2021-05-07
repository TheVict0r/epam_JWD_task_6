package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class CargoUnit implements Serializable{
	
	private int id; // без id было бы невозможно корректно реализовать hash code и equals
	private int weight;
	
		
	public CargoUnit() { }
	
	public CargoUnit (int id, int weight) {
		this.id = id;
		this.weight = weight;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		if (this.id != unit.getId()) {
			return false;
		}
		if (this.weight != unit.getWeight()){
			return false;
		}
		else {
			return true;
		}
	}	
	
	@Override
	public int hashCode() {
		final int meaning = 42;
		int result = 1;
		result = result * meaning * meaning + meaning + weight;
		result = result * meaning * meaning + meaning + id;
		return result;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + ": [id - " + id + ", weight - " + weight;
	}

	
}
