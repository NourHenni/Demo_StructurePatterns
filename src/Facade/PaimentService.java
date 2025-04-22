package Facade;

class PaimentService {
    public boolean processPayment(String clientId, double montant) {

        System.out.println("Traitement du paiement de " + montant + " € pour le client " + clientId);
        return true;
    }

    public void genererFacture(String clientId, double montant) {

        System.out.println("Génération de la facture pour le client " + clientId + " d'un montant de " + montant + " €");
    }
}
