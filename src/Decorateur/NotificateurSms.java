package Decorateur;

public class NotificateurSms extends NotificateurDecorator {
	
    public NotificateurSms(Notificateur notificateur) {
        super(notificateur);
    }

    @Override
    public void send(String msg) {
        System.out.println("SMS : " + msg);
        super.send(msg);

    }
}
