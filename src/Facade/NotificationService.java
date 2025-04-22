package Facade;

class NotificationService {
    public void envoyerConfirmation(String clientId, String numeroCommande) {

        System.out.println("Envoi d'un email de confirmation au client " + clientId + " pour la commande " + numeroCommande);
    }
}
