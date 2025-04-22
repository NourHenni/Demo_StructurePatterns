package DecorateurNaive;

public class NotificateurEmailEtSMS extends Notificateur{

    @Override
    public void envoyer(String message) {
        super.envoyer(message);
        System.out.println("Message SMS envoyé : " + message);
    }
}
