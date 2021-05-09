package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;

import java.io.Serializable;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;

//источник - https://www.airlines-inform.ru/commercial-aircraft/boeing-737-800.html
@SuppressWarnings("serial")
public class Boeing737800 extends Airliner implements Serializable {

	public Boeing737800() {
		
	}
	
	public Boeing737800(int id, int manufactYear) {
		super(id, manufactYear, 20540, 5400, 850, 2526, new Passenger[189]);
		
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
