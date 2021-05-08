package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.io.Serializable;

//источник - https://www.airlines-inform.ru/commercial-aircraft/boeing-737-800.html
@SuppressWarnings("serial")
public class Boening737800 extends Airliner implements Serializable {

	public Boening737800() {
		
	}
	
	public Boening737800(int id, int manufactYear) {
		super(id, manufactYear, 20540, 5400, 850, 2526, new Passenger[189]);
		
	}
	
}
