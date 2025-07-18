import javax.swing.*;
import java.awt.*;

public class PlayField extends JPanel {

    private PlayerComponent player;

    public PlayField() {
        setLayout(null);
        this.player = new PlayerComponent(new Player(100, 300, 300));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        g.setColor(Color.GRAY); // dark green
        g.fillRect(0, 0, getWidth(), getHeight());

        draw();
    }

    private void draw() {
        this.removeAll();
        player.setBounds(player.getX(), player.getY(), 10, 10);
        this.add(player);
    }
}
