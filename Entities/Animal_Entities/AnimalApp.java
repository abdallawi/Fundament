package Entities.Animal_Entities;
//TODO why does this class exist, same goes for the PlantApp?
// if it's for testing purposes makes sure you delete them when you're done
// this is not clean code
import Entities.Plant_Entities.*;

public class AnimalApp {

	public static void main(String[] args) {

		Herbivore animal = new Herbivore("aname", 1,0.5,0.2);
		Plant w = new Plant("w",1);
		Weed weed = new Weed("weed1");
		animal.AddPlantToDiet(w);
		animal.AddPlantToDiet(weed);
		
		System.out.println(animal);
		System.out.println();
		animal.printDiet();

		System.out.println();
		
		Omnivore omni = new Omnivore("aname");
		
	}

}
