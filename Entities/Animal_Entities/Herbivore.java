package Entities.Animal_Entities;


import java.util.HashSet;
import java.util.Set;
import Entities.Plant_Entities.Plant;


public class Herbivore extends Animal {
	
	private Set<Plant> plantDiet;

//	Constructors
	
	public Herbivore(String name) {
		this(name,0,0,0);
	}
	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		setPlantDiet(new HashSet<>());
		
	}

// 	Getters and Setters	
	
	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> planDiet) {
		this.plantDiet = planDiet;
	}
	
//	Add a new plant to the plan diet of an herbivore
	
	public void AddPlantToDiet(Plant plant) {
		plantDiet.add(plant);
	}
	
//	Plan diet print
	public void printDiet() {
		this.plantDiet.forEach(e -> System.out.println(e.getName()));
	}
	
	
	@Override
	public String toString() {
		return "This animal is a  " + this.getName().toUpperCase() +
				", it's an "+this.getClass().getSimpleName().toLowerCase() + ", it's mesure " +
				this.getWeight() + " Kg, " + 
				this.getHeight() + " m height, and " + this.getLength()  + "m length";
	}
}
