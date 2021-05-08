package by.jwd.pravdivets.task6.karlssonairlines.entity;
//Обычный пассажирский
public abstract class Airliner extends AbstractPlane{

	public final int LUGGAGE_WEIGHT_BUSINESS = 32; //по данным Белавиа
	public final int LUGGAGE_WEIGHT_ECONOMY = 23; //по данным Белавиа
	 //(businessClass ? LUGGAGE_WEIGHT_BUSINESS : LUGGAGE_WEIGHT_ECONOMY)
	
	public Airliner() {
		
	}
	
	public Airliner(int id, int manufactYear, int maxLoad, int flightRange, int maxSpeed,
			int fuelConsumption, Passenger[] passenger) {
		super(id, manufactYear, maxLoad, flightRange, maxSpeed, fuelConsumption, passenger);
		}

	
}
