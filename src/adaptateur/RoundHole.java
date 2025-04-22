/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptateur;

/**
 *
 * @author nourb
 */
public class RoundHole {
    /**
 * RoundHoles are compatible with RoundPegs.
 */

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

   

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
    

