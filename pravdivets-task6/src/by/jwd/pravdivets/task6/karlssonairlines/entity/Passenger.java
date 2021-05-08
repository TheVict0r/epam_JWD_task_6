package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Passenger extends CargoUnit implements Serializable{

	//вес багажа будем учитывать вместе с пассажиром. С точки зрения авиакомпании прописывать багаж отдельно смысла нет. 
	boolean businessClass;
	
	public Passenger() { }
	
	public Passenger(int id, int weight, boolean businessClass) {
		super(id, weight);
		
		this.businessClass = businessClass;
	}


	public boolean isBusinessClass() {
		return businessClass;
	}

	public void setBusinessClass(boolean businessClass) {
		this.businessClass = businessClass;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(this.getClass() != o.getClass()) {
			return false;
		}
		if(!super.equals(o)) {
			return false;
		}
		Passenger passanger = (Passenger) o;

		if (this.businessClass != passanger.businessClass) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (businessClass ? 1221 : 1239);
		return result;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", " + (businessClass ? "business class" : "economy class") + "]";
	}
	
	
}
