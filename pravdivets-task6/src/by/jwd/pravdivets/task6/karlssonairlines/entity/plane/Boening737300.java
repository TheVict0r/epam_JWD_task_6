package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;
//источник - https://www.airlines-inform.ru/commercial-aircraft/boeing-737-300.html
import java.io.Serializable;

import by.jwd.pravdivets.task6.karlssonairlines.entity.Airliner;
import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;

@SuppressWarnings("serial")
public class Boening737300 extends Airliner  implements Serializable {

	public Boening737300() {
	}

	
	public Boening737300(int id, int manufactYear) {
		super(id, manufactYear, 15000, 2600, 795, 2600, new Passenger[149]);
	}
	
}