package snake.main;

import javax.swing.*;

public class Window extends JFrame {
    Window(Panel panel) {
        super();

        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(panel);
        pack();

        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
