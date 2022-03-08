import javax.swing.*;
import java.awt.*;

public class Black extends Soldier {


    public Black(int x,int y,int w,int h) {
        super(x, y, w, h);
        this.setIcon(new ImageIcon("image/black.png"));
        this.setBackground(Color.BLACK);
    }

}
