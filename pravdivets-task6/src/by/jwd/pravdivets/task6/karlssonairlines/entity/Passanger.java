package by.jwd.pravdivets.task6.karlssonairlines.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Passanger extends CargoUnit implements Serializable{

	private int luggageWeight; //багаж будем учитывать вместе с пассажиром. С точки зрения авиакомпании прописывать отдельно смысла нет. 
	boolean businessClass;
	
	public Passanger() {
		
	}
	
	public Passanger(int id, int weight, int luggageWeight) {
		
	}
	
	
	
}
