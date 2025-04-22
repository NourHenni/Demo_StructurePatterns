package Facade;

public class Main {
    public static void main(String[] args) {

        CommandeInfo commande = new CommandeInfo(
                "CLI-123",
                "PROD-456",
                2,
                29.99,
                "123 Rue des Lilas, 75000 Paris"
        );

        CommandeFacade commandeFacade = new CommandeFacade();
        boolean resultat = commandeFacade.traiterCommande(commande);

        if (resultat) {
            System.out.println("Processus de commande terminé avec succès.");
        } else {
            System.out.println("Le processus de commande a échoué.");
        }
    }
}
