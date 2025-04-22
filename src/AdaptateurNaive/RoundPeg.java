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
public class RoundPeg {
    
    // Pièce ronde qui peut être insérée dans un trou rond
    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

