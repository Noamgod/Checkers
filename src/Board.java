import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    private int x, y, w, h;
    private Color c;


    public Board(int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.c = c;
    }


    public void paintComponent(Graphics g) {
        g.setColor(c);
        g.fillRect(x, y, w, h);
    }
}
