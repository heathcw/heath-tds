import javax.swing.*;
import java.awt.*;

public class PlayField extends JPanel {

    private final PlayerComponent playerComp;

    public PlayField() {
        this.playerComp = new PlayerComponent(new Player(100, 300, 300));

        playerComp.setBounds(0,0,30,30);
        this.add(playerComp);

        playerComp.setFocusable(true);
        playerComp.requestFocusInWindow();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        g.setColor(Color.GRAY); // dark green
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
