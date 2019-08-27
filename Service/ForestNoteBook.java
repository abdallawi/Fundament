package Service;


import java.util.ArrayList;
import java.util.List;

import Entities.Animal_Entities.*;
import Entities.Plant_Entities.*;

public class ForestNoteBook {
	
	private List<Carnivore> carnivores = new ArrayList<>();
	private List<Omnivore> omnivores= new ArrayList<>();
	private List<Herbivore> herbivores= new ArrayList<>();
	private int plantCount;
	private int animalCount;
	private List<Animal> animals= new ArrayList<>();
	private List<Plant> plants = new ArrayList<>();
	
//	Getters and Setters
	public List<Carnivore> getCarnivores() {
		return carnivores;
	}
	
	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
		for(Carnivore c : carnivores) {
			animals.add(c);
			++animalCount;
		}
	}
	
	public List<Omnivore> getOmnivores() {
		return omnivores;
	}
	
	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
		omnivores.forEach(o -> animals.add(o));
		animalCount += omnivores.size();
	}
	
	public List<Herbivore> getHerbivores() {
		return herbivores;
	}
	public void setHerbivores(List<Herbivore> herbivores) {
		this.herbivores = herbivores;
		for(Herbivore h : herbivores) {
			animals.add(h);
			++animalCount;
		}
	}
	
	
	public int getPlantCount() {
		return plantCount;
	}
	
	public int getAnimalCount() {
		return animalCount;
	}
	
//	Add new animal to the animal list
	
	public void addAnimal(Animal animal) {
		if(!animals.contains(animal)) {
			this.animals.add(animal);
			++animalCount;
		}
	}
	
//	add new plant to plant list
	public void addPlant(Plant plant) {
		if(!plants.contains(plant)) {
			this.plants.add(plant);
			++plantCount;
		}
		
	} 
	
	
//  sort animal list by name
	
	public void sortAnimalByName() {
		this.animals.sort((a1,a2)-> a1.getName().compareTo(a2.getName())); 
	}
	
//  sort animal list by name
		
	public void sortPlantByName() {
		this.plants.sort((p1,p2)-> p1.getName().compareTo(p2.getName())); 
	}
	
//	Print Notebook : print list of animals and a list of plant
	
	public void printNoteBook() {
		
		if(!animals.isEmpty()) { 
			System.out.println("Animals met in the forest :");
			for (Animal a : animals) {
				System.out.println(a);
			}
		}
		 System.out.println();
		if(!plants.isEmpty()) {
			System.out.println("Plants discovered in the forest :");
			for (Plant p : plants) {
				System.out.println(p);
			}
		}
			
	}

	
	
}
