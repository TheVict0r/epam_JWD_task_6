package by.jwd.pravdivets.task6.karlssonairlines;

public enum Destinations {

	MOSCOW(728),
	KIEV(542),
	PARIS(2114),
	NEW_YORK(7111),
	BEIJING(6472),
	URUPINSK(1346);
	
	int distance;
	
	Destinations(int distance){
		this.distance = distance;
	}
	
	
}
