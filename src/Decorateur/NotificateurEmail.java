package Decorateur;

public class NotificateurEmail implements Notificateur {
	
	public void send(String msg) {
		System.out.println("Email: "+msg);
	}
}
