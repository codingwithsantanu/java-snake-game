package snake.main;

public class Game {
    private Window window;
    private Panel panel;

    Game() {
        panel = new Panel();
        window = new Window(panel);
    }
}
