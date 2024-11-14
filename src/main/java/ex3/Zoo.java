package ex3;

import java.util.List;

/** Classe permettant la gestion d'un zoo
 *
 */
public class Zoo {

	/** Chaine de caractère contenant le nom du zoo */
	private String nom;

	/** Liste de chaines de caractères contenant les différents animaux */
	private List<Animal> animaux;

	/** Constructeur
	 *
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
	}

	/** Méthode permettant d'ajouter une animal
	 *
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}

	/** Méthode permettant d'afficher les différents animaux
	 *
	 */
	public void afficherListeAnimaux(){
		for (Animal animal : animaux) {
			System.out.println(animal);
		}
	}

	/** Méthode permattant de retourner le nombre d'animaux présent dans le zoo
	 *
	 * @return
	 */
	public int nombreAnimaux() {
		return animaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
