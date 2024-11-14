package ex3;
public class ZooApplication {

	public static void main(String[] args) {
		/** Appel du constructeur de la classe Zoo*/
		Zoo zoo = new Zoo("Thoiry");

		/** Appel de la fonction addAnimal de la classe Zoo en utilisatant le constructeur de la classe Animal*/
		zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Zèbre", "MAMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Lion", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimal(new Animal("Requin blanc", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
		zoo.addAnimal(new Animal("Boa constrictor", "SERPENT", "CARNIVORE"));
		zoo.addAnimal(new Animal("Python", "SERPENT", "CARNIVORE"));
	}

}