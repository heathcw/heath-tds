import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PlayerComponent extends JComponent {
    private final Player thePlayer;

    public PlayerComponent(Player newPlayer) {
        thePlayer = newPlayer;

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'w') {
                    System.out.println("W pressed");
                    thePlayer.updateX(1);
                }
                if (e.getKeyChar() == 's') {
                    System.out.println("S pressed");
                    thePlayer.updateX(-1);
                }
                if (e.getKeyChar() == 'd') {
                    System.out.println("D pressed");
                    thePlayer.updateY(1);
                }
                if (e.getKeyChar() == 'a') {
                    System.out.println("A pressed");
                    thePlayer.updateX(-1);
                }
                revalidate();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 10, 10);
    }
}
