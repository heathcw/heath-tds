import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PlayField extends JPanel {

    private final PlayerComponent playerComp;
    private ArrayList<Enemy> baddies;

    public PlayField() {
        this.playerComp = new PlayerComponent(new Player(100, 300, 300));
        this.baddies = new ArrayList<>();

        playerComp.setBounds(0,0,30,30);
        this.add(playerComp);

        playerComp.setFocusable(true);
        playerComp.requestFocusInWindow();

        EnemyComponent enemyComp = new EnemyComponent(new Enemy(10, 0, 0));
        enemyComp.setBounds(0, 0, 30, 30);
        this.add(enemyComp);
        this.setComponentZOrder(enemyComp, 0);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
