package FacadeNaive;

public class Main {

    public static void main(String[] args) {
        String clientId = "CLI-123";
        String produitId = "PROD-456";
        int quantite = 2;
        double prixUnitaire = 29.99;
        double montantTotal = prixUnitaire * quantite;
        String adresse = "123 Rue des Lilas, 75000 Paris";

        StockService stockService = new StockService();
        PaimentService paiementService = new PaimentService();
        LivraisonService livraisonService = new LivraisonService();
        NotificationService notificationService = new NotificationService();

        boolean disponible = stockService.verifierDisponibilite(produitId, quantite);

        if (disponible) {

            boolean paiementReussi = paiementService.processPayment(clientId, montantTotal);

            if (paiementReussi) {
                stockService.mettreAJourStock(produitId, quantite);

                paiementService.genererFacture(clientId, montantTotal);

                livraisonService.programmerLivraison(clientId, adresse);

                String numeroCommande = "CMD-" + Math.round(Math.random() * 10000);
                notificationService.envoyerConfirmation(clientId, numeroCommande);

                System.out.println("Commande traitée avec succès. Numéro de commande : " + numeroCommande);
            } else {
                System.out.println("Échec du paiement. La commande n'a pas pu être traitée.");
            }
        } else {
            System.out.println("Produit non disponible en quantité demandée.");
        }
    }
}
