package Entities.Animal_Entities;

import java.util.HashSet;
import java.util.Set;

import Entities.Plant_Entities.Plant;

public class Omnivore extends Animal {

	private Set<Plant> plantDiet;
	private double maxFoodSize;

//	Constructors
	
	public Omnivore(String name) {
		this(name,0,0,0);
	}
	public Omnivore(String name, double weight, double heigh, double length) {
		super(name, weight, heigh, length);
		setPlantDiet( new HashSet<Plant>());
		
	}
	
// 	Getters and Setters
	
	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}
	
	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}
	
	public double getMaxFoodSize() {
		return maxFoodSize;
	}
	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	
//	Add a new plant to the plan diet of an herbivore
	
	public void AddPlantToDiet(Plant plant) {
		plantDiet.add(plant);
	}
	
	@Override
	public String toString() {
		 return "This animal is a  " + this.getName().toUpperCase() +
				", it's an "+this.getClass().getSimpleName().toLowerCase() + ", it's mesure " +
				this.getWeight() + " Kg, " + 
				this.getHeight() + " m height, and " + this.getLength()  + "m length";
	}
	
}
