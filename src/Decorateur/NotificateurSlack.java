package Decorateur;

class NotificateurSlack extends NotificateurDecorator {
    public NotificateurSlack(Notificateur notificateur) {
        super(notificateur);
    }

    public void send(String msg) {
        System.out.println("Slack : " + msg);
        super.send(msg);

    }
}
