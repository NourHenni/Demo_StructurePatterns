package DecorateurNaive;

public class NotificateurEmailEtFacebook extends Notificateur {

    @Override
    public void envoyer(String message) {
        super.envoyer(message);
        System.out.println("Message Facebook envoyé : " + message);
    }
}
