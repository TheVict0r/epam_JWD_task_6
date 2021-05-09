package by.jwd.pravdivets.task6.karlssonairlines.logic;

import by.jwd.pravdivets.task6.karlssonairlines.entity.cargo.Passenger;

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
	
	
}
