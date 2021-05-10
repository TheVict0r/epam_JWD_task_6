package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;

import java.io.Serializable;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;

//источник - https://www.airlines-inform.ru/commercial-aircraft/boeing-737-800.html
@SuppressWarnings("serial")
public class Boeing737800 extends Airliner implements Serializable {

	public Boeing737800() {
		
	}

	/*в конструкторе ниже используются объективные характеристики данной модели самолета, 
	они в любом случае остаются неизменными*/
	private final static int MAX_LOAD  = 20540;
	private final static int FLIGHT_RANGE = 5400; 
	private final static int CRUISE_SPEED = 850;
	private final static int FUEL_CONSUMPTION = 2526; 
	private final static Passenger[] PASSENGERS = new Passenger[189];

	public Boeing737800(int id, int manufactYear) {
		super(id, manufactYear, MAX_LOAD, FLIGHT_RANGE, CRUISE_SPEED, FUEL_CONSUMPTION, PASSENGERS);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		if (!super.equals(obj))
			return false;
		return true;
	}

	
	@Override
	public int hashCode() {
		return super.hashCode();
	}


	
	@Override
	public String toString() {
		return super.toString();
	}
	

	
	
}
