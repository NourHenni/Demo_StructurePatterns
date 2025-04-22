package Composite;

class Produit implements Composant {
    private double prix;

    public Produit(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }
}