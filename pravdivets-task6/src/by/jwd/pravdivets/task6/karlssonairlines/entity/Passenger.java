package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Passenger extends CargoUnit implements Serializable{

	
	boolean businessClass;
	
	public final int HUMAN_WEIGHT_AVERAGE = 80;
	public final int LUGGAGE_WEIGHT_BUSINESS = 32; //по данным Белавиа
	public final int LUGGAGE_WEIGHT_ECONOMY = 23; //по данным Белавиа
	//вес багажа будем учитывать вместе с пассажиром. С точки зрения авиакомпании прописывать багаж отдельно смысла нет. 
	int weightTotal = HUMAN_WEIGHT_AVERAGE + (businessClass ? LUGGAGE_WEIGHT_BUSINESS : LUGGAGE_WEIGHT_ECONOMY);

	public Passenger() { }
	
	public Passenger(int id,  boolean businessClass) {
		super(id);
		this.businessClass = businessClass;
		super.setWeight(weightTotal);
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
		if (this.weightTotal != passanger.weightTotal) {
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
