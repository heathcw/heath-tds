import javax.swing.*;

public class GameMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pew-Pew");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);

        PlayField field = new PlayField();
        frame.setContentPane(field);

        frame.setVisible(true);
    }
}
