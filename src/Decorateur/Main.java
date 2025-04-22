package Decorateur;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notificateur notificateur = new NotificateurEmail();

		notificateur = new NotificateurSlack(notificateur);
        notificateur = new NotificateurSms(notificateur);

        notificateur.send("Alerte : Problème détecté !");
	}

}