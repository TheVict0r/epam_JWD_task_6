package by.jwd.pravdivets.task6.karlssonairlines.entity;

import by.jwd.pravdivets.task6.karlssonairlines.PlaneModel;

public abstract class AbstractPlane {

	PlaneModel model;
	int manufactYear;
	
	
	
	double length;
	double wingSpan; //размах крыла
	double height;
	double maxLandWeight; // максимальный посадочный вес
	double maxCommercialLoad; //макс. коммерческая загрузка
	int flightRange; //дальность полета с макс. загрузкой
	int maxSpeed; //макс. крейсерская скорость
	
	//for passangers
	int seatsEconomy;
	int seatsBusiness;
	
	public abstract void fly();

	@Override
	public String toString() {
		return getClass().getSimpleName() + " - [model=" + model + ", manufactYear=" + manufactYear + "]";
	}
	
	
	
	/*
	 * Типы самолетов
	 * 
	 * Пассажирский - Airliner
	 * Легкий - LightJet
	 * Тяжелый реактивный HeavyJet
	 * транспортные - Cargo aircraft
	 * Почтовый - Mail plane
	 * 
	 * 
	 */
	
	
}
