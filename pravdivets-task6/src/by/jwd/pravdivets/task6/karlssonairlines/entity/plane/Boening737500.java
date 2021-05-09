package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;

import java.io.Serializable;

import by.jwd.pravdivets.task6.karlssonairlines.entity.Airliner;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;

//источник https://www.airlines-inform.ru/commercial-aircraft/boeing-737-500.html
public class Boening737500 extends Airliner  implements Serializable {

	public Boening737500() {
		
	}
	
	public Boening737500(int id, int manufactYear) {
		super(id, manufactYear, 14770, 3400, 795, 2400, new Passenger[132]);
		
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
