package Composite;

import java.util.ArrayList;
import java.util.List;

class Boite implements Composant {
    private List<Composant> elements = new ArrayList<>();

    public void ajouter(Composant composant) {
        elements.add(composant);
    }

    @Override
    public double getPrix() {
        double total = 0;
        for (Composant composant : elements) {
            total += composant.getPrix();
        }
        return total;
    }
}
