import javax.swing.*;
import java.awt.*;


public class Red extends Soldier {


    public Red(int x, int y, int w, int h) {
        super(x, y, w, h);
        this.setIcon(new ImageIcon("image/Red.png"));
        this.setBackground(Color.RED);
    }

}


