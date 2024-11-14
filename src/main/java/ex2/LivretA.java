package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération*/
	private double tauxRemuneration;

	/** Constructeur
	 *
	 * @param type
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > 0){
			this.setSolde(this.getSolde() - montant);
		}
	}

	/** Méthode qui applique la rémuneration annuelle du livret A
	 *
	 */
	public void appliquerRemuAnnuelle(){
		this.setSolde(this.getSolde() + this.getSolde()*tauxRemuneration/100);
	}

	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
