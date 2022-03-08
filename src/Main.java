import javax.swing.*;

public class Main extends JFrame {
    static Panel panel;
    public static void main(String[] args) {
        Main main = new Main();
        main.init();

    }

    public void init() {
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1100, 1080);
        this.setResizable(false);
        this.setTitle("Checkers");
        this.setLocationRelativeTo(null);
        panel = new Panel();
        this.add(panel);
        ImageIcon icon = new ImageIcon("image/Icon.png");
        this.setIconImage(icon.getImage());


    }
}
