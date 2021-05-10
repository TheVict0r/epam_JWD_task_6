package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;
//источник - https://www.airlines-inform.ru/commercial-aircraft/boeing-737-300.html
import java.io.Serializable;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;

@SuppressWarnings("serial")
public class Boeing737300 extends Airliner  implements Serializable {

	
	public Boeing737300() {
	}

	/*в конструкторе ниже используются объективные характеристики данной модели самолета, 
	они в любом случае остаются неизменными*/
	private final static int MAX_LOAD  = 15000;
	private final static int FLIGHT_RANGE = 2600; 
	private final static int CRUISE_SPEED = 795;
	private final static int FUEL_CONSUMPTION = 2600; 
	private final static Passenger[] PASSENGERS = new Passenger[149];
	
	public Boeing737300(int id, int manufactYear) {
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
