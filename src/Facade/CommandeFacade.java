package Facade;

class CommandeFacade {
    private StockService stockService;
    private PaimentService paiementService;
    private LivraisonService livraisonService;
    private NotificationService notificationService;

    public CommandeFacade() {
        this.stockService = new StockService();
        this.paiementService = new PaimentService();
        this.livraisonService = new LivraisonService();
        this.notificationService = new NotificationService();
    }

    public boolean traiterCommande(CommandeInfo commande) {
        if (!stockService.verifierDisponibilite(commande.getProduitId(), commande.getQuantite())) {
            System.out.println("Produit non disponible en quantité demandée.");
            return false;
        }

        if (!paiementService.processPayment(commande.getClientId(), commande.getMontantTotal())) {
            System.out.println("Échec du paiement. La commande n'a pas pu être traitée.");
            return false;
        }

        stockService.mettreAJourStock(commande.getProduitId(), commande.getQuantite());

        paiementService.genererFacture(commande.getClientId(), commande.getMontantTotal());

        livraisonService.programmerLivraison(commande.getClientId(), commande.getAdresse());

        String numeroCommande = "CMD-" + Math.round(Math.random() * 10000);
        notificationService.envoyerConfirmation(commande.getClientId(), numeroCommande);

        System.out.println("Commande traitée avec succès. Numéro de commande : " + numeroCommande);
        return true;
    }
}
