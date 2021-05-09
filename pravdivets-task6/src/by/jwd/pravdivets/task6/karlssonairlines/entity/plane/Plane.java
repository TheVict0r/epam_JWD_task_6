package by.jwd.pravdivets.task6.karlssonairlines.entity.plane;

public abstract class Plane {

	private int id;
	private int manufactYear;
	private int maxLoad; //Макс. коммерческая загрузка (кг)
	private int currentLoad; 
	private int flightRange; //Дальность полета с макс. загрузкой (км)	
	private int cruiseSpeed; //Крейсерская скорость (км/ч)
	private int fuelConsumption; //Часовой расход топлива (кг)
	/*
	 * При решении задачи я исходил из следующей идеи: 
	 * Основополагающим признаком, определяющим тип самолета, 
	 * является характер груза, который будет перевозиться - люди, товары и т.д. 
	 * Именно груз обуславливает назначение самолета и его технические характеристики. 
	 */
	
	
	public Plane() {  };
	
	public Plane(int id, int manufactYear, int maxLoad, int flightRange, int cruiseSpeed,
			int fuelConsumption) {
		this.id = id;
		this.manufactYear = manufactYear;
		this.maxLoad = maxLoad;
		this.flightRange = flightRange;
		this.cruiseSpeed = cruiseSpeed;
		this.fuelConsumption = fuelConsumption;
	}

	
	public int getId() {
		return id;
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


	public int getCruiseSpeed() {
		return cruiseSpeed;
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

	public void setCurrentLoad(int currentLoad) {
		this.currentLoad = currentLoad;
	}
	
//  сеттеры ниже убрал намеренно - эти характеристики у каждой конкретной модели 
//  задаются конструктором и должны оставаться неизменными
	
//	public void setMaxLoad(int maxLoad) {
//		this.maxLoad = maxLoad;
//	}
//
//	public void setFlightRange(int flightRange) {
//		this.flightRange = flightRange;
//	}
//
//	public void setCruiseSpeed(int cruiseSpeed) {
//		this.cruiseSpeed = cruiseSpeed;
//	}
//
//	public void setFuelConsumption(int fuelConsumption) {
//		this.fuelConsumption = fuelConsumption;
//	}

	
	public void fly() {
		System.out.println(getClass().getSimpleName() + "ID " + id + " is flying.");
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
		result = prime * result + cruiseSpeed;
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
		Plane other = (Plane) obj;
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
		if (cruiseSpeed != other.cruiseSpeed)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [ID = " + this.getId() + ", year of manufactory = " + this.getManufactYear();
		//специально не закрывал "]", чтобы продолжить строку в производных классах.
	}



}
