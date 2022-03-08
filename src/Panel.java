import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Board[][] board = new Board[8][8];
    public static Soldier[][] soldiersBlack = new Soldier[12][12];
    public static Soldier[][] soldiersRed = new Soldier[12][12];
    public Soldier soldier= new Soldier();


    Panel() {
        // JOptionPane.showInputDialog(null, "Enter name", "Sing-in", 2);
        //JOptionPane.showMessageDialog(null, "Welcome!\n\tTo beat the game you must cross the road unharmed\n\tThis game is really bad  so good luck\n\t By the way the timer on the top right is pointless.\nUse the arrow keys to move in each direction.\n" + "To Sprint forward press the Space button.\n\t" + "Have Fun!", "How to play", 3);

        this.setBounds(0, 0, 1920, 1080);
        this.setLocale(null);
        this.addMouseListener(soldier);
        makeBoard();
        makeSoldier();
        mainGameLoop();
    }

    public void mainGameLoop() {
        new Thread(() -> {
            while (true) {
                repaint();
            }

        }).start();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j].paintComponent(g);
            }
        }
    }


    public void makeBoard() {
        boolean flag = true;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (flag)
                    board[i][j] = new Board(i * 130, j * 130, 130, 130, Color.BLACK);
                else
                    board[i][j] = new Board(i * 130, j * 130, 130, 130, Color.white);
                flag = !flag;
                repaint();
            }
            flag = !flag;
        }
    }

    public void makeSoldier() {
        boolean flag = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (flag) {
                    soldiersBlack[i][j] = new Black(i * 260, j * 130, 130, 130);
                } else
                    soldiersBlack[i][j] = new Black(i * 260 + 130, j * 130, 130, 130);
                this.add(soldiersBlack[i][j]);
                flag = !flag;
            }
            flag = !flag;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (flag)
                    soldiersRed[i][j] = new Red(i * 260 + 130, 650 + j * 130, 130, 130);
                else
                    soldiersRed[i][j] = new Red(i * 260, 650 + j * 130, 130, 130);
                this.add(soldiersRed[i][j]);
                flag = !flag;
            }
            flag = !flag;
        }
    }
}
