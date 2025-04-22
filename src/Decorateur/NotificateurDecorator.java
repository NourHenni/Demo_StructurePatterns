package Decorateur;

public abstract class NotificateurDecorator implements Notificateur {
	
	protected Notificateur notifier;
	
	NotificateurDecorator(Notificateur n) {
		this.notifier = n;
	}
	
	public void send(String msg) {
		this.notifier.send(msg);
	}
}
