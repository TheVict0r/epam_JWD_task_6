package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Passenger extends CargoUnit implements Serializable{

	private int luggageWeight; //багаж будем учитывать вместе с пассажиром. С точки зрения авиакомпании прописывать отдельно смысла нет. 
	boolean businessClass;
	
	public Passenger() { }
	
	public Passenger(int id, int weight, int luggageWeight) {
		super(id, weight);
		this.luggageWeight = luggageWeight;
		this.businessClass = businessClass;
	}

	public int getLuggageWeight() {
		return luggageWeight;
	}

	public boolean isBusinessClass() {
		return businessClass;
	}

	public void setLuggageWeight(int luggageWeight) {
		this.luggageWeight = luggageWeight;
	}

	public void setBusinessClass(boolean businessClass) {
		this.businessClass = businessClass;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = super.hashCode();
//		result = prime * result + (businessClass ? 1231 : 1237);
//		result = prime * result + luggageWeight;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!super.equals(obj))
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Passanger other = (Passanger) obj;
//		if (businessClass != other.businessClass)
//			return false;
//		if (luggageWeight != other.luggageWeight)
//			return false;
//		return true;
//	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) {
			return false;
		}
		Passenger passanger = (Passenger) o;

		if (this.luggageWeight != passanger.luggageWeight) {
			return false;
		}

		if (this.businessClass != passanger.businessClass) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int meaning = 42;
		int result = super.hashCode();
		result = result * meaning + luggageWeight;
	}
	
	
	
	
	
}
