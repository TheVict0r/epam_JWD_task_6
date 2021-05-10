package by.jwd.pravdivets.task6.karlssonairlines.entity.cargo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Passenger extends Cargo implements Serializable{

	boolean businessClass;
	
	public final int HUMAN_WEIGHT_AVERAGE = 80;//нашёл в интернете
	
	public Passenger() { }
	
	public Passenger(int id, double ticketPrice, boolean businessClass) {
		super(id, ticketPrice);
		this.businessClass = businessClass;
		super.setWeight(HUMAN_WEIGHT_AVERAGE);
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
		if (super.getWeight() != passanger.getWeight()) {
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
