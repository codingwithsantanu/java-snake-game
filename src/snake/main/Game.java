package snake.main;

import static snake.main.GameConstants.*;

public class Game implements Runnable {
    private Window window;
    private Panel panel;

    Game() {
        panel = new Panel();
        window = new Window(panel);
    }

    @Override
    public void run() {
        final long timePerTick = 1_000_000_000 / FPS;
        long lastTime = System.nanoTime();
        long currentTime;

        while (true) {
            currentTime = System.nanoTime();

            if (currentTime - lastTime >= timePerTick) {
                lastTime = currentTime;

                update();
                render();
            }
        }
    }

    private void update() {

    }

    private void render() {

    }
}
