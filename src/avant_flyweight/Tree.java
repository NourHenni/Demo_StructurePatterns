package avant_flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

// Classe représentant un arbre complet (sans partage d'état)
class Tree {
    private int x, y;
    private String name;
    private Color color;
    private String texture;

    public Tree(int x, int y, String name, Color color, String texture) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
