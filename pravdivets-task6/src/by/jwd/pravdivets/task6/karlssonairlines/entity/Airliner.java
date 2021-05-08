package by.jwd.pravdivets.task6.karlssonairlines.entity;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;

//Обычный пассажирский
public abstract class Airliner extends AbstractPlane{

	public final int LUGGAGE_WEIGHT_BUSINESS = 32; //по данным Белавиа
	public final int LUGGAGE_WEIGHT_ECONOMY = 23; //по данным Белавиа
	 //(businessClass ? LUGGAGE_WEIGHT_BUSINESS : LUGGAGE_WEIGHT_ECONOMY)
	
	public Airliner() {
		
	}
	
	public Airliner(int id, int manufactYear, int maxLoad, int flightRange, int cruiseSpeed,
			int fuelConsumption, Passenger[] passenger) {
		super(id, manufactYear, maxLoad, flightRange, cruiseSpeed, fuelConsumption, passenger);
		}

	
}
