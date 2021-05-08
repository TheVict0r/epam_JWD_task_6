package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.io.Serializable;

//источник https://www.airlines-inform.ru/commercial-aircraft/boeing-737-500.html
public class Boening737500 extends Airliner  implements Serializable {

	public Boening737500() {
		
	}
	
	public Boening737500(int id, int manufactYear) {
		super(id, manufactYear, 14770, 3400, 795, 2400, new Passenger[132]);
		
	}
	
}
