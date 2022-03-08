import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Soldier extends JButton implements ActionListener, MouseListener {
    static JButton currentPressed;
    static int turn = 0;

    public Soldier(int x, int y, int w, int h) {
        this.setBounds(x, y, w, h);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.addActionListener(this);
    }

    public Soldier() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton temp = (JButton) e.getSource();
        if (!(turn % 2 == 0) && temp.getBackground() == Color.BLACK) {
            currentPressed = temp;
            System.out.println(temp);
        }
        if (temp.getBackground() == Color.red && turn % 2 == 0) {
            currentPressed = temp;
            System.out.println(temp);
        }


    }

    public int[] getIndex(JButton temp) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Panel.soldiersRed[i][j] == temp || Panel.soldiersBlack[i][j] == temp)
                    return new int[]{i, j};
            }
        }
        return null;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");
        System.out.println(currentPressed);

        if (currentPressed != null) {
            currentPressed.setBounds((e.getX() / 130) * 130, (e.getY() / 130) * 130, 130, 130);
            currentPressed = null;
            turn++;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
