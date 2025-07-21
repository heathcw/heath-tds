import javax.swing.*;
import java.awt.*;

public class EnemyComponent extends JComponent {
    private final Enemy baddie;

    public EnemyComponent(Enemy newEnemy) {
        baddie = newEnemy;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(baddie.getX(), baddie.getY(), 10, 10);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(10, 10); // Make sure it has size
    }
}
