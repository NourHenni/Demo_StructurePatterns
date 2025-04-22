package avant_flyweight;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//Classe représentant la forêt qui contient plusieurs arbres
class Forest extends JFrame {
 private List<Tree> trees = new ArrayList<>();

 public void plantTree(int x, int y, String name, Color color, String texture) {
     Tree tree = new Tree(x, y, name, color, texture);
     trees.add(tree);
 }

 @Override
 public void paint(Graphics g) {
     for (Tree tree : trees) {
         tree.draw(g);
     }
 }
}
