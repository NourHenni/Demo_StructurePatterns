package FacadeNaive;

class StockService {
    public boolean verifierDisponibilite(String produitId, int quantite) {

        System.out.println("Vérification de la disponibilité de " + quantite + " unités du produit " + produitId);
        return true;
    }

    public void mettreAJourStock(String produitId, int quantite) {

        System.out.println("Mise à jour du stock : retrait de " + quantite + " unités du produit " + produitId);
    }
}
