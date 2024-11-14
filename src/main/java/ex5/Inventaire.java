package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets",0,5));
		caisses.add(new Caisse("Moyens objets",5,20));
		caisses.add(new Caisse("Grands objets",20, Integer.MAX_VALUE));
	}

	/** Classe permettant d'ajouter un item dans la caisse approprier
	 *
	 * @param item
	 */
	public void addItem(Item item) {
		for(Caisse caisse : caisses){
			if(caisse.acceptItem(item.getPoids())){
				caisse.addItem(item);
			}
		}
	}

	public int taille() {

		int nombreItemsTotal = 0;

		for(Caisse caisse : caisses){
			nombreItemsTotal += caisse.nombreItems();
		}

		return nombreItemsTotal;
	}
}
