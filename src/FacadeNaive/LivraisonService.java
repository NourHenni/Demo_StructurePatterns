package FacadeNaive;

class LivraisonService {
    public void programmerLivraison(String clientId, String adresse) {

        System.out.println("Programmation de la livraison pour le client " + clientId + " à l'adresse : " + adresse);
    }

    public String genererNumeroSuivi() {

        String numeroSuivi = "TRACK-" + Math.round(Math.random() * 10000);
        System.out.println("Génération du numéro de suivi : " + numeroSuivi);
        return numeroSuivi;
    }
}
