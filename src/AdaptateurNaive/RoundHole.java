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
// Trou rond qui accepte uniquement des pièces rondes
class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return peg.getRadius() <= this.radius;
    }
}



