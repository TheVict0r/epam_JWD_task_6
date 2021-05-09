package by.jwd.pravdivets.task6.karlssonairlines.logic;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;
import by.jwd.pravdivets.task6.karlssonairlines.entity.plane.Airliner;
import by.jwd.pravdivets.task6.karlssonairlines.exception.CargoOverloadException;
import by.jwd.pravdivets.task6.karlssonairlines.exception.NullCargoException;
import by.jwd.pravdivets.task6.karlssonairlines.logic.exception.NullPlaneException;

public class CargoLoader {

	public final int LUGGAGE_WEIGHT_BUSINESS = 32; //по данным Белавиа
	public final int LUGGAGE_WEIGHT_ECONOMY = 23; //по данным Белавиа
	
	public Passenger[] makePassengersPool(int businessNuber, int econimyNumber, 
			double businessTicketPrice, double economyTicketPrice) {
		
		int totalPassengers = businessNuber + econimyNumber;
		
		Passenger[] pool = new Passenger[totalPassengers];

		for(int i = 1; i <= totalPassengers; i++) {
			Passenger passenger;
			
			if (i <= businessNuber) {
				passenger = new Passenger(i, businessTicketPrice, true);
				passenger.setWeight(passenger.getWeight() + LUGGAGE_WEIGHT_BUSINESS);
			} else {
				passenger = new Passenger(i, economyTicketPrice, false);
				passenger.setWeight(passenger.getWeight() + LUGGAGE_WEIGHT_ECONOMY);
			}
			
			pool[i] = passenger;
			
		}
		
		return pool;
	}
	
	public void loadPassangers(Airliner airliner, Passenger[] pool) throws NullPlaneException, NullCargoException, CargoOverloadException {
		
		if (airliner == null) {
			throw new NullPlaneException("Undefined plane " + airliner, new NullPointerException());
		}
		
		if (pool == null) {
			throw new NullCargoException("Undefined cargo " + pool, new NullPointerException());
		}
		
		if (pool.length > airliner.getPassengers().length) {
			throw new CargoOverloadException("Too much passengers for this plane");
		}
		
		for (int i = 0; i < pool.length; i++) {
			airliner.getPassengers()[i] = pool[i];
		}
		
	}
	
	
}
