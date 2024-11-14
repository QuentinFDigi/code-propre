package ex1;

import java.util.Date;

/** Classe permettant d'enregister une Entreprise ainsi que ses attributs
 *
 */
public class Entreprise {

	/**
	 * Le numéro de siret de l'entreprise en int
	 */
	private int Siret;
	/**
	 * Chaine de caractère représentant le nom de l'entreprise
	 */
	private String Nom;
	/**
	 * Chaine de caractère représentant l'adresse de l'entreprise
	 */
	private String adresse;
	/**
	 * Date représentant la date de création de l'entreprise
	 */
	private Date date_Creation;

	/**
	 * Chaine de caractère représentant le statut de l'entreprise
	 */
	private String statut;

	/**
	 * Attribut non modifiable indiquant le capital maximum
	 */
	private static final int capitalMax = 3_000_000;

	/** Méthode pour afficher le statut de l'entreprise
	 *
	 */
	public String afficherStatut(){
		return "L'entreprise est " + statut;
	}
	
}
