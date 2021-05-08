package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.util.Arrays;

public abstract class AbstractPlane {

	private int id;
	private int manufactYear;
	private int maxLoad; //Макс. коммерческая загрузка (кг)
	private int currentLoad; 
	private int flightRange; //Дальность полета с макс. загрузкой (км)	
	private int maxSpeed; //Макс. крейсерская скорость (км/ч)
	private int fuelConsumption; //Часовой расход топлива (кг)
	private Cargo[] cargo;
	/*
	 * При решении задачи я исходил из следующей идеи: 
	 * Основополагающим признаком, определяющим направления деятельности авикомпании, 
	 * является характер груза, который будет перевозиться - люди, товары и т.д. 
	 * Именно груз обуславливает выбор типа самолёта и его конкретные характеристики. 
	 */
	
	public int getId() {
		return id;
	}

	
	public AbstractPlane() {
		
	}
	
	public AbstractPlane(int id, int manufactYear, int maxLoad, int flightRange, int maxSpeed,
			int fuelConsumption, Cargo[] cargo) {
		this.id = id;
		this.manufactYear = manufactYear;
		this.maxLoad = maxLoad;
		this.flightRange = flightRange;
		this.maxSpeed = maxSpeed;
		this.fuelConsumption = fuelConsumption;
		this.cargo = cargo;
	}


	public Cargo[] getCargo() {
		return cargo;
	}


	public void setCargo(Cargo[] cargo) {
		this.cargo = cargo;
	}


	public int getManufactYear() {
		return manufactYear;
	}


	public int getMaxLoad() {
		return maxLoad;
	}
	
	
	public int getCurrentLoad() {
		return maxLoad;
	}


	public int getFlightRange() {
		return flightRange;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}



	public int getFuelConsumption() {
		return fuelConsumption;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setManufactYear(int manufactYear) {
		this.manufactYear = manufactYear;
	}


	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}


	public void setCurrentLoad(int currentLoad) {
		this.currentLoad = currentLoad;
	}
	
	
	public void setFlightRange(int flightRange) {
		this.flightRange = flightRange;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	
	public void fly() {
		System.out.println(getClass().getSimpleName() + "ID " + id + " is flying.");
	}

	public void load() {
		System.out.println(getClass().getSimpleName() + "ID " + id + " is loading.");
	}
	
	public void unload() {
		System.out.println(getClass().getSimpleName() + "ID " + id + " is unloading.");
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + flightRange;
		result = prime * result + fuelConsumption;
		result = prime * result + id;
		result = prime * result + manufactYear;
		result = prime * result + maxLoad;
		result = prime * result + maxSpeed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractPlane other = (AbstractPlane) obj;
		if (flightRange != other.flightRange)
			return false;
		if (fuelConsumption != other.fuelConsumption)
			return false;
		if (id != other.id)
			return false;
		if (manufactYear != other.manufactYear)
			return false;
		if (maxLoad != other.maxLoad)
			return false;
		if (maxSpeed != other.maxSpeed)
			return false;
		if (!Arrays.equals(cargo, other.cargo))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [id=" + id + ", manufactYear=" + manufactYear + 
				", currentLoad=" + currentLoad + "]";
	}



}
