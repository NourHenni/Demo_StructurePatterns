/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdaptateurNaive;

/**
 *
 * @author nourb
 */
public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        // Fonctionne bien car roundPeg a un rayon
        System.out.println(hole.fits(roundPeg)); //  true

        // Création d'une pièce carrée
        SquarePeg squarePeg = new SquarePeg(5);

        // Erreur ! SquarePeg n'est pas compatible avec RoundHole
       // System.out.println(hole.fits(squarePeg)); //  !
    }
}
