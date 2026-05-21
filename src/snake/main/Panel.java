package snake.main;

import javax.swing.*;
import java.awt.*;

import static snake.main.GameConstants.*;

public class Panel extends JPanel {
    Panel() {
        setDimensions();
    }

    private void setDimensions() {
        Dimension dimension = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);
        setMinimumSize(dimension);
        setPreferredSize(dimension);
        setMaximumSize(dimension);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.setColor(Color.blue);
        graphics.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
    }
}
