package CompositeNaive;

import java.util.ArrayList;
import java.util.List;

class Boite {
    List<Object> elements = new ArrayList<>();

    void ajouter(Object obj) {
        elements.add(obj);
    }

    double getPrix() {
        double total = 0;
        for (Object obj : elements) {
            if (obj instanceof Produit) {
                total += ((Produit) obj).getPrix();
            } else if (obj instanceof Boite) {
                total += ((Boite) obj).getPrix();
            }
        }
        return total;
    }
}
