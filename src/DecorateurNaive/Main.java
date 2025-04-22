package DecorateurNaive;

public class Main {
    public static void main(String[] args) {
        Notificateur emailNotif = new Notificateur();
        NotificateurSMS smsNotif = new NotificateurSMS();
        NotificateurFacebook fbNotif = new NotificateurFacebook();

        NotificateurEmailEtFacebook emailFbNotif = new NotificateurEmailEtFacebook();
        NotificateurEmailEtSMS emailSmsNotif = new NotificateurEmailEtSMS();

        emailNotif.envoyer("Notification importante");
        smsNotif.envoyer("Notification importante");
        fbNotif.envoyer("Notification importante");

        emailFbNotif.envoyer("Notification importante");
        emailSmsNotif.envoyer("Notification importante");
    }
}
