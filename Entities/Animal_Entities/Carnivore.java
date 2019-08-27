package Entities.Animal_Entities;

import java.util.HashSet;
import java.util.Set;

import Entities.Plant_Entities.Plant;

public class Carnivore extends Animal {

	private double maxFoodSize;

//	Constructors
	
	public Carnivore(String name) {
		this(name,0,0,0);
	}
	public Carnivore(String name, double weight, double heigh, double length) {
		super(name, weight, heigh, length);
		
		
	}
	
// 	Getters and Setters
	
	
	public double getMaxFoodSize() {
		return maxFoodSize;
	}
	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	@Override
	public String toString() {
		return "This animal is a  " + this.getName().toUpperCase() +
				", it's an "+this.getClass().getSimpleName().toLowerCase() + ", it's mesure " +
				this.getWeight() + " Kg, " + 
				this.getHeight() + " m height, and " + this.getLength()  + "m length";
	}
	
}
