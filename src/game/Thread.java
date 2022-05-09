package game;

public class Thread extends java.lang.Thread {
    public void run() {
        Game game = new Game("Tetris");
        game.run();

    }
}
