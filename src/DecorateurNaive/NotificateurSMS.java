package DecorateurNaive;

public class NotificateurSMS extends Notificateur {
    public void envoyer(String message) {
        System.out.println("SMS envoyé: " + message);
    }
}
