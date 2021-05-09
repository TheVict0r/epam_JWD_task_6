package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;
//источник - https://www.airlines-inform.ru/commercial-aircraft/boeing-737-300.html
import java.io.Serializable;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;

@SuppressWarnings("serial")
public class Boeing737300 extends Airliner  implements Serializable {

	public Boeing737300() {
	}

	
	public Boeing737300(int id, int manufactYear) {
		super(id, manufactYear, 15000, 2600, 795, 2600, new Passenger[149]);
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
