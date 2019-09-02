package ForestBook_App;

import Entities.Animal_Entities.*;
import Entities.Plant_Entities.*;

import Service.ForestNoteBook;

//TODO you never added the plants to the herbivore and omnivore diet
// also never printed
public class ForestBookApp {
	public static void main(String[] args) {
		ForestNoteBook forestNoteBook = new  ForestNoteBook();

// 		Create some plants
		Weed juniper = new Weed("Juniper",1.2);
		Weed rasberry = new Weed("Red Rasberry",1.7);
		Flower rose = new Flower("Nookta rose");
		rose.setSmell(Scent.SWEET);
		rose.setHeight(1.6);
		Flower twin = new Flower("Twin Flower");
		Tree tamarack = new Tree("Tamarack",7.9 );

//		Add the created plant to the notebook	
		forestNoteBook.addPlant(juniper);
		forestNoteBook.addPlant(rasberry);
		forestNoteBook.addPlant(rose);
		forestNoteBook.addPlant(twin);
		forestNoteBook.addPlant(tamarack);
		forestNoteBook.addPlant(tamarack);
		
//  	Create some animals	
		
		Herbivore gazelle = new Herbivore("Gazelle", 13, 1.6,2.3);
		Herbivore gerbil = new Herbivore("Gerbil", 1.3, 0.5,0.3);
		Herbivore BonteBok = new Herbivore("Addax", 15, 1.7,2.3);
		
		Carnivore fossa = new Carnivore("Fosse");
		fossa.setHeigh(0.9);
		fossa.setLength(1.9);
		fossa.setWeight(7.6);
		Carnivore badger = new Carnivore("Badger", 23, 2.5, 3.2);
		Carnivore Ocelot = new Carnivore("Ocelo", 28, 3, 2.6);
				
		Omnivore squirell = new Omnivore("Squirell", 2,0.8,0.9);
		Omnivore hare = new Omnivore("Hare", 1.3, 0.5,0.3);
		Omnivore capybara = new Omnivore("Capybara", 15, 1.7,2.3);
		
//		Add the created animal to the notebook	
		forestNoteBook.addAnimal(gazelle);
		forestNoteBook.addAnimal(gerbil);
		forestNoteBook.addAnimal(fossa);
		forestNoteBook.addAnimal(BonteBok);
		forestNoteBook.addAnimal(badger);
		forestNoteBook.addAnimal(Ocelot);
		forestNoteBook.addAnimal(squirell);
		forestNoteBook.addAnimal(hare);
		forestNoteBook.addAnimal(capybara);
		
		System.out.println("Number of animals : " + forestNoteBook.getAnimalCount());
		System.out.println("Number of plant: " +forestNoteBook.getPlantCount());
		
		System.out.println();
		
	
		forestNoteBook.sortPlantByName();
		forestNoteBook.printNoteBook();
		
		
	}
}
