package Facade;

class CommandeInfo {
    private String clientId;
    private String produitId;
    private int quantite;
    private double prixUnitaire;
    private String adresse;

    public CommandeInfo(String clientId, String produitId, int quantite, double prixUnitaire, String adresse) {
        this.clientId = clientId;
        this.produitId = produitId;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.adresse = adresse;
    }

    public String getClientId() { return clientId; }
    public String getProduitId() { return produitId; }
    public int getQuantite() { return quantite; }
    public double getMontantTotal() { return prixUnitaire * quantite; }
    public String getAdresse() { return adresse; }
}