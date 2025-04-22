package Composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Boite petiteBoite = new Boite();
        petiteBoite.ajouter(new Produit(10));
        petiteBoite.ajouter(new Produit(20));

        Boite moyBoite = new Boite();
        moyBoite.ajouter(new Produit(30));
        moyBoite.ajouter(new Produit(90));
        
        Boite grandeBoite = new Boite();
        grandeBoite.ajouter(petiteBoite);
        grandeBoite.ajouter(moyBoite);
        grandeBoite.ajouter(new Produit(50));

        System.out.println("Prix total de la commande : " + grandeBoite.getPrix());
	}

}
