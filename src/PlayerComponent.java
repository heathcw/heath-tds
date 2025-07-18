import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PlayerComponent extends JComponent {
    private final Player thePlayer;

    public PlayerComponent(Player newPlayer) {
        thePlayer = newPlayer;
        setFocusable(true);
        setupKeyBindings();
    }

    private void setupKeyBindings() {
        InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = getActionMap();

        // Bind 'W'
        inputMap.put(KeyStroke.getKeyStroke('w'), "moveUp");
        actionMap.put("moveUp", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thePlayer.updateY(-10);
                repaint();
            }
        });

        // Bind 'S'
        inputMap.put(KeyStroke.getKeyStroke('s'), "moveDown");
        actionMap.put("moveDown", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thePlayer.updateY(10);
                repaint();
            }
        });

        // Bind 'D'
        inputMap.put(KeyStroke.getKeyStroke('d'), "moveRight");
        actionMap.put("moveRight", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thePlayer.updateX(10);
                repaint();
            }
        });

        // Bind 'A'
        inputMap.put(KeyStroke.getKeyStroke('a'), "moveLeft");
        actionMap.put("moveLeft", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thePlayer.updateX(-10);
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(thePlayer.getX(), thePlayer.getY(), 30, 30);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 600); // Make sure it has size
    }
}
