package DecorateurNaive;

public class NotificateurFacebook extends Notificateur {
    @Override
    public void envoyer(String message) {
        System.out.println("Message Facebook envoyé : " + message);
    }
}